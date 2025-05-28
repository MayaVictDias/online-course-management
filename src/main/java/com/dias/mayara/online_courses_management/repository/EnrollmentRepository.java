package com.dias.mayara.online_courses_management.repository;

import com.dias.mayara.online_courses_management.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository <Enrollment, Long> {
    // This interface will automatically inherit methods for CRUD operations
    // on Enrollment entities, such as save, findById, findAll, deleteById, etc.
}
