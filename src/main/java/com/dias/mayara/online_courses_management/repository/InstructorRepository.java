package com.dias.mayara.online_courses_management.repository;

import com.dias.mayara.online_courses_management.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    // This interface will automatically inherit methods for CRUD operations
    // on Instructor entities, such as save, findById, findAll, deleteById, etc.
}
