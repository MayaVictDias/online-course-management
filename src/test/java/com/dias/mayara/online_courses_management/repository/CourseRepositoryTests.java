package com.dias.mayara.online_courses_management.repository;

import com.dias.mayara.online_courses_management.model.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CourseRepositoryTests {

    // Repository to handle course data operations
    @Autowired
    CourseRepository courseRepository;

    @Test
    public void testFindAll() {

        List<Course> courses = courseRepository.findAll();

        System.out.println(courses);
    }

    // Test to verify if the application context loads correctly
    @Test
    public void testSaveCourse() {
        Course course = new Course();
        course.setName("English");
        course.setDescription("English course for brazilian speakers");
        course.setWorkload(30.0);

        courseRepository.save(course);
        System.out.println("Course saved! " + course);
    }

    @Test
    public void testUpdateCourse() {

    }

    // Test to verify if a course can be deleted by its ID
    @Test
    public void testDeleteCourse() {
        courseRepository.deleteById(102L);
    }
}
