package net.javaprojects.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaprojects.sms.entity.Student;
import net.javaprojects.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Hamza", "Sougou", "sougouhamza@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Nelson", "Mandela", "mandela@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Mohamed", "Ali", "alimohamed@gmail.com");
//		studentRepository.save(student3);
		
	}

}
