package com.dias.mayara.online_courses_management.controller;

import com.dias.mayara.online_courses_management.model.Course;
import com.dias.mayara.online_courses_management.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/")
    public List<Course> findAll() {
        return courseService.findAll();
    }

    @PostMapping
    public Course save(@RequestBody Course course) {
        return courseService.save(course);
    }
}
