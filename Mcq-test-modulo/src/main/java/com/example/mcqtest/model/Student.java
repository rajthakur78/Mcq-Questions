package com.example.mcqtest.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    private String referenceId; // Unique ID used for login

    private String password;

    public Student() {}

    public Student(String referenceId, String password) {
        this.referenceId = referenceId;
        this.password = password;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
