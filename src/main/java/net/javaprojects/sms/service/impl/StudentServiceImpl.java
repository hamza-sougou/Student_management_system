package net.javaprojects.sms.service.impl;

import java.util.List;

import net.javaprojects.sms.repository.StudentRepository;
import net.javaprojects.sms.service.StudentService;

import org.springframework.stereotype.Service;

import net.javaprojects.sms.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}
