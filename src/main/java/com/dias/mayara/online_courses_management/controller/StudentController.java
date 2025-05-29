package com.dias.mayara.online_courses_management.controller;

import com.dias.mayara.online_courses_management.model.Student;
import com.dias.mayara.online_courses_management.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Buscar todos os estudantes
    @GetMapping("/")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    // Criar novo estudante
    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    // Atualizar estudante por ID
    @PutMapping("{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Student student) {
        studentService.update(id, student);
    }

    // Deletar estudante por ID
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        studentService.deleteById(id);
    }
}