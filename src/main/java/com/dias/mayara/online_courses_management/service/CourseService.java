package com.dias.mayara.online_courses_management.service;

import com.dias.mayara.online_courses_management.model.Course;
import com.dias.mayara.online_courses_management.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    // Repository to handle course data operations
    private CourseRepository courseRepository;

    // Constructor to inject the CourseRepository dependency
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // Method to save a course in the repository
    public Course save(Course course) {

        courseRepository.save(course);
        return course;
    }

    // Method to retrieve all courses from the repository
    public List<Course> findAll() {

        return courseRepository.findAll();
    }

    // Method to update a course by its ID
    public void update(Long id, Course course) {

        course.setId(id);

        courseRepository.save(course);
    }

    // Method to delete a course by its ID
    public void deleteById(Long id) {

        courseRepository.deleteById(id);
    }
}
