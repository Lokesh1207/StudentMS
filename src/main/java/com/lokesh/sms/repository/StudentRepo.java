package com.lokesh.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lokesh.sms.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

	List<Student> findAll();


}
