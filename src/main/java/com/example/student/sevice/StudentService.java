package com.example.student.sevice;

import java.util.List;
import java.util.Optional;

import com.example.student.model.Student;


public interface StudentService {

	List<Student> getAllStudents();
	Optional<Student> getStudentsById(Long id);
	void createStudent(Student student);
	void updateStudent(Long id);
	void deleteStudent(Long id);

}
