package com.student.management.service;

import java.util.List;

import com.student.management.entity.Student;

public interface StudentService {

	List<Student> getAllStudentList();
	
	Student saveStudent(Student student);
	
}
