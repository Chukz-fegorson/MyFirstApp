package com.starter.MyFirstApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")  // Handles GET requests for "/courses"
    @ResponseBody
    public List<Courses> retrieveAllCourses() {
        return Arrays.asList(
                new Courses(1, "Learn AWS", "Chuks Fegorson"),
                new Courses(2, "Learn Python", "Chuks Fegorson"),
                new Courses(3, "Learn Azure", "Chuks Fegorson")
        );
    }
    //@GetMapping
}