package edu.enrollmentsystem.serviceimpl;

import edu.enrollmentsystem.dto.CourseDTO;
import edu.enrollmentsystem.service.CourseService;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {

    private List<CourseDTO> courses =
            new ArrayList<>();

    @Override
    public void registerCourse(CourseDTO course) {
        courses.add(course);
    }

    public List<CourseDTO> getCourses() {
        return courses;
    }
}