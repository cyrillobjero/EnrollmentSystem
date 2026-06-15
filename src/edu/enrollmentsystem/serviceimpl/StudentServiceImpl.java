package edu.enrollmentsystem.serviceimpl;

import edu.enrollmentsystem.dto.StudentDTO;
import edu.enrollmentsystem.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private List<StudentDTO> students =
            new ArrayList<>();

    @Override
    public void registerStudent(StudentDTO student) {
        students.add(student);
    }

    public List<StudentDTO> getStudents() {
        return students;
    }
}