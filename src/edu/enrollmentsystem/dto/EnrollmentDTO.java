package edu.enrollmentsystem.dto;
public class EnrollmentDTO {

    private String enrollmentId;
    private StudentDTO student;
    private CourseDTO course;

    public EnrollmentDTO(String enrollmentId,
                         StudentDTO student,
                         CourseDTO course) {

        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public StudentDTO getStudent() {
        return student;
    }

    public CourseDTO getCourse() {
        return course;
    }
}