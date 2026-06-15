package edu.enrollmentsystem.repository;

import edu.enrollmentsystem.dto.StudentDTO;
import java.util.List;

public interface StudentRepository {

    void addStudent(StudentDTO student);

    List<StudentDTO> getAllStudents();
}
