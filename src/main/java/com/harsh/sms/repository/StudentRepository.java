package com.harsh.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
