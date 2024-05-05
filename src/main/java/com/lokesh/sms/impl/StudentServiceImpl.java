package com.lokesh.sms.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lokesh.sms.entity.Student;
import com.lokesh.sms.repository.StudentRepo;
import com.lokesh.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepo studentrepo;
	
	public StudentServiceImpl(StudentRepo studentrepo) {
		super();
		this.studentrepo = studentrepo;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentrepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentrepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentrepo.deleteById(id);
		
	}
}
