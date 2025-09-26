package com.example.mcqtest.service;

import com.example.mcqtest.model.Question;
import com.example.mcqtest.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    private final QuestionRepository questionRepo;

    public QuizService(QuestionRepository questionRepo) {
        this.questionRepo = questionRepo;
    }

    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }
}
