package com.dias.mayara.online_courses_management.repository;

import com.dias.mayara.online_courses_management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // This interface will automatically inherit methods for CRUD operations
    // on Student entities, such as save, findById, findAll, deleteById, etc.
}
