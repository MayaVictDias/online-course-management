package com.dias.mayara.online_courses_management.repository;

import com.dias.mayara.online_courses_management.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // This interface will automatically inherit methods for CRUD operations
    // on Course entities, such as save, findById, findAll, deleteById, etc.
}
