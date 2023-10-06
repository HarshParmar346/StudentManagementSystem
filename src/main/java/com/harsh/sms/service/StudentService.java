package com.harsh.sms.service;

import java.util.List;

import com.harsh.sms.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	void addStudent(Student s);
	void updateStudent(Student s);
	Student getStudentById(Long id);
	
	void deleteStudentById(Long id);
}
