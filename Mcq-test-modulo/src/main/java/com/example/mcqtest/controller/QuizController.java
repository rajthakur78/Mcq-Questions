package com.example.mcqtest.controller;

import com.example.mcqtest.model.Question;
import com.example.mcqtest.model.Submission; // Fixed class name (should be capitalized)
import com.example.mcqtest.repository.QuestionRepository;
import com.example.mcqtest.repository.SubmissionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class QuizController {

    private final QuestionRepository questionRepo;
    private final SubmissionRepository submissionRepo;

    public QuizController(QuestionRepository questionRepo, SubmissionRepository submissionRepo) {
        this.questionRepo = questionRepo;
        this.submissionRepo = submissionRepo;
    }

    @GetMapping("/quiz")
    public String showQuiz(Model model) {
        List<Question> questions = questionRepo.findAll();
        model.addAttribute("questions", questions);
        
        // Add referenceId to the model for the form
        model.addAttribute("referenceId", generateReferenceId());
        return "quiz";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam Map<String, String> params, Model model) {
        int score = 0;
        
        // Generate reference ID if not provided
        String referenceId = params.get("referenceId");
        if (referenceId == null || referenceId.trim().isEmpty()) {
            referenceId = generateReferenceId();
        }

        Submission submission = new Submission();
        submission.setReferenceId(referenceId);

        List<Map<String, Object>> feedback = new ArrayList<>();
        List<Question> allQuestions = questionRepo.findAll();
        
        // Debug: Print all parameters received
        System.out.println("=== Received Parameters ===");
        params.forEach((key, value) -> System.out.println(key + " = " + value));
        System.out.println("===========================");

        // Process each question
        for (Question question : allQuestions) {
            String paramKey = "q_" + question.getId();
            String selectedValue = params.get(paramKey);
            
            if (selectedValue != null) {
                try {
                    int selectedIndex = Integer.parseInt(selectedValue);
                    
                    // Validate index bounds
                    if (selectedIndex >= 0 && selectedIndex < question.getOptions().size()) {
                        boolean isCorrect = (selectedIndex == question.getCorrectOptionIndex());
                        
                        if (isCorrect) {
                            score++;
                        }

                        // Add to submission answers
                        submission.getAnswers().put(question.getId(), selectedIndex);

                        // Create feedback
                        Map<String, Object> result = new HashMap<>();
                        result.put("question", question.getQuestionText());
                        result.put("selected", question.getOptions().get(selectedIndex));
                        result.put("correct", question.getOptions().get(question.getCorrectOptionIndex()));
                        result.put("isCorrect", isCorrect);
                        feedback.add(result);
                        
                        System.out.println("Q" + question.getId() + ": Selected=" + selectedIndex + 
                                         ", Correct=" + question.getCorrectOptionIndex() + 
                                         ", IsCorrect=" + isCorrect);
                    } else {
                        System.out.println("Invalid index for question " + question.getId() + ": " + selectedIndex);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format for question " + question.getId() + ": " + selectedValue);
                }
            } else {
                System.out.println("No answer provided for question " + question.getId());
            }
        }

        submission.setScore(score);
        submissionRepo.save(submission);

        model.addAttribute("score", score);
        model.addAttribute("referenceId", referenceId);
        model.addAttribute("total", allQuestions.size());
        model.addAttribute("feedback", feedback);

        System.out.println("Final Score: " + score + "/" + allQuestions.size());
        
        return "result";
    }

    private String generateReferenceId() {
        return "REF-" + System.currentTimeMillis() + "-" + new Random().nextInt(1000);
    }
}