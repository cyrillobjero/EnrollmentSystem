package edu.enrollmentsystem.serviceimpl;

import edu.enrollmentsystem.dto.EnrollmentDTO;
import edu.enrollmentsystem.service.EnrollmentService;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentServiceImpl
        implements EnrollmentService {

    private List<EnrollmentDTO> enrollments =
            new ArrayList<>();

    @Override
    public void enrollStudent(EnrollmentDTO enrollment) {
        enrollments.add(enrollment);
    }

    public List<EnrollmentDTO> getEnrollments() {
        return enrollments;
    }
}
