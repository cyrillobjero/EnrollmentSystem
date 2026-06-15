package edu.cyrillmay.dto;

public class CourseDTO {

    private String courseCode;
    private String courseName;

    public CourseDTO(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
}