package com.harsh.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.harsh.sms.entity.Student;
import com.harsh.sms.service.StudentService;



@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;

	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", service.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/add")
	public String addStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "createStudent";
	}
	
	@PostMapping("/students")
	public String addStudent(@ModelAttribute("student") Student student) {
		service.addStudent(student);
		return "redirect:/students";
	}
	
	
	@GetMapping("/students/update/{id}")
	public String updateStudentForm(@PathVariable("id") Long id, Model model) {
		
		Student s = service.getStudentById(id);
		model.addAttribute("student", s);
		return "updateForm";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable("id")Long id ,
			@ModelAttribute("student") Student student,
			Model model) {
		student.setId(id);
		service.updateStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		
		service.deleteStudentById(id);
		return "redirect:/students";
	}
	
}
