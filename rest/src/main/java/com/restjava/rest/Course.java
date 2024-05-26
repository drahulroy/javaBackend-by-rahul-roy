package com.restjava.rest;

public class Course {
    private final String courseId;
    private final String courseName;
    private final String courseAuther;


    public Course(int courseId, String courseName, String courseAuther) {
        this.courseId = String.valueOf(courseId);
        this.courseName = courseName;
        this.courseAuther = courseAuther;
    }


    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAuther() {
        return courseAuther;
    }



    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseAuther='" + courseAuther + '\'' +
                '}';
    }
}



