package com.beshoycode.cruddemo;

import com.beshoycode.cruddemo.dao.StudentDAO;
import com.beshoycode.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);

		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating student .........");
		Student tempStudent = new Student("beshoooo","Younan","beshoy.younan@gmail.com" );
		// save the student object
		System.out.println(" saving the student ......... ");
		studentDAO.save(tempStudent);
		// display the id of the saved student
System.out.println(" ID for saved student is " + tempStudent.getId());
	}
}
