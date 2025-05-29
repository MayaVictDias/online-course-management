package com.dias.mayara.online_courses_management.service;

import com.dias.mayara.online_courses_management.model.Student;
import com.dias.mayara.online_courses_management.repository.StudentRepository;
import com.dias.mayara.online_courses_management.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    // Service to handle student-related operations
    private final StudentRepository studentRepository;

    // Constructor to inject the StudentRepository dependency
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Find all students
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    // Save a new student
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    // Update a student by ID
    public void update(Long id, Student student) {

        student.setId(id);

        studentRepository.save(student);
    }

    // Delete a student by ID
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
