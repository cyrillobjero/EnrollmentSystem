package edu.enrollmentsystem.repository;

import edu.enrollmentsystem.dto.CourseDTO;
import java.util.List;

public interface CourseRepository {

    void addCourse(CourseDTO course);

    List<CourseDTO> getAllCourses();
}
