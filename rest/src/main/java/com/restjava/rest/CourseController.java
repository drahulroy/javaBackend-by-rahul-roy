package com.restjava.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/course")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
                new Course(1,"Learn AWS","BY Rahul Roy"),
                new Course(2,"Learn Python","BY Roy"),
                new Course(3,"Learn Mysql","BY Sachin"),
                new Course(4,"Learn React","BY Ashish"),
                new Course(5,"Learn MongoDB","BY Ashish")
        );
    }
}
