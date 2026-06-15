package edu.enrollmentsystem.repository;

import enrollmentsystem.dto.EnrollmentDTO;
import java.util.List;

public interface EnrollmentRepository {

    void enroll(EnrollmentDTO enrollment);

    List<EnrollmentDTO> getAllEnrollments();
}