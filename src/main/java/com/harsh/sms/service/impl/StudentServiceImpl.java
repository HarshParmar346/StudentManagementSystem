package com.harsh.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.sms.entity.Student;
import com.harsh.sms.repository.StudentRepository;
import com.harsh.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		repository.save(s);
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		repository.save(s);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
