package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.dao.StudentDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner ->{
			//createStudent(studentDao);
			readStudent(studentDao);
			queryStudent(studentDao);
			//updateStudent(studentDao);
			deleteStudent(studentDao);
		};
	}

	private void updateStudent(StudentDao studentDao) {

		studentDao.updateStudent();
	}

	public void deleteStudent(StudentDao studentDao){
		studentDao.deleteStudent();
	}

	private void queryStudent(StudentDao studentDao) {

		List<Student> studentList =  studentDao.findByFirstName();
		for(Student tmp : studentList)
			System.out.println("Student by first name:"+tmp.firstName);


		studentList =  studentDao.findByLastName("Patra");
		for(Student tmp : studentList)
			System.out.println("Student by last name:"+tmp.firstName+ " "+tmp.lastName);
	}

	private void readStudent(StudentDao studentDao) {

		Student student = studentDao.findById(3);
		System.out.println("Student details:"+student.id+" firstname:"+ student.firstName+
				"lastname:"+student.lastName+ " email:"+student.email);

	}

	private void createStudent(StudentDao studentDao) {

		Student s = new Student();
		s.firstName = "Ravi";
		s.lastName ="Hansda";
		s.email="ravihansda@gmail.com";
		studentDao.save(s);

		s = new Student();
		s.firstName = "Raj";
		s.lastName ="Kapoor";
		s.email="rajkapoor@gmail.com";
		studentDao.save(s);

		s = new Student();
		s.firstName = "Raj";
		s.lastName ="Patra";
		s.email="rajpatra@gmail.com";
		studentDao.save(s);

		s = new Student();
		s.firstName = "Uma";
		s.lastName ="Patra";
		s.email="umapatra@gmail.com";
		studentDao.save(s);



	}

}
