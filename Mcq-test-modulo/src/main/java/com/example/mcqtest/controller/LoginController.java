package com.example.mcqtest.controller;

import com.example.mcqtest.model.Student;
import com.example.mcqtest.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    private final StudentRepository studentRepo;

    public LoginController(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String referenceId,
                               @RequestParam String password,
                               Model model) {
        Student student = studentRepo.findByReferenceIdAndPassword(referenceId, password);
        if (student != null) {
            model.addAttribute("studentName", student.getReferenceId());
            return "redirect:/quiz";
        } else {
            model.addAttribute("error", "Invalid ID or password");
            return "login";
        }
    }
}
