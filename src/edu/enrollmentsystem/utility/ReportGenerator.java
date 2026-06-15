package edu.enrollmentsystem.utility;

import edu.enrollmentsystem.dto.EnrollmentDTO;
import java.util.List;

public class ReportGenerator {

    public void generateEnrollmentReport(
            List<EnrollmentDTO> enrollments) {

        for (EnrollmentDTO e : enrollments) {

            System.out.println(
                    e.getStudent().getName()
                            + " -> "
                            + e.getCourse().getCourseName()
            );
        }
    }
}