package com.dias.mayara.online_courses_management.repository;

import com.dias.mayara.online_courses_management.model.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseRepositoryTests {

    @Autowired
    CourseRepository courseRepository;

    @Test
    public void testSaveCourse() {
        Course course = new Course();
        course.setName("English");
        course.setDescription("English course for brazilian speakers");
        course.setWorkload(30.0);

        courseRepository.save(course);
        System.out.println("Course saved! " + course);
    }
}
