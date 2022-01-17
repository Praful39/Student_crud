package com.example.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.model.Assignment;


public interface AssignmentRepository extends JpaRepository<Assignment, Long>{

	List<Assignment> findByStudentId(Long studentId);
}
