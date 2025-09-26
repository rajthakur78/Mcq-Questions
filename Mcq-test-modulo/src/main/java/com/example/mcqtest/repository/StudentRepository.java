package com.example.mcqtest.repository;

import com.example.mcqtest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
    Student findByReferenceIdAndPassword(String referenceId, String password);
}
