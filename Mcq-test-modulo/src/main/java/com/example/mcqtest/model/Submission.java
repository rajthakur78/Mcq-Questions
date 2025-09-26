package com.example.mcqtest.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "submissions") // Explicit table name
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference_id", unique = true, nullable = false)
    private String referenceId;

    @ElementCollection
    @CollectionTable(
        name = "submitted_answers", 
        joinColumns = @JoinColumn(name = "submission_id")
    )
    @MapKeyColumn(name = "question_id")
    @Column(name = "selected_option_index")
    private Map<Long, Integer> answers = new HashMap<>();

    private int score;
    
    @Column(name = "submitted_at")
    private LocalDateTime submittedAt;

    // Constructors
    public Submission() {
        this.submittedAt = LocalDateTime.now();
    }

    public Submission(String referenceId, int score) {
        this();
        this.referenceId = referenceId;
        this.score = score;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Map<Long, Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Long, Integer> answers) {
        this.answers = answers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }
}