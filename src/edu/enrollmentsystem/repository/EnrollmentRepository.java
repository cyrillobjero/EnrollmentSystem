package edu.enrollmentsystem.repository;

import edu.enrollmentsystem.dto.EnrollmentDTO;
import java.util.List;

public interface EnrollmentRepository {

    void enroll(EnrollmentDTO enrollment);

    List<EnrollmentDTO> getAllEnrollments();
}