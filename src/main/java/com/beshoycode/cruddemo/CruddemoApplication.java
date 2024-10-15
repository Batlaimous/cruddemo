package com.beshoycode.cruddemo;

import com.beshoycode.cruddemo.dao.StudentDAO;
import com.beshoycode.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//queryForstudentLastName(studentDAO);
			//updateTheStudent(studentDAO);
			//deleteTheStudent(studentDAO);

		};
	}

	private void deleteTheStudent(StudentDAO studentDAO) {
		int studentId = 3;
		System.out.println("Deleting student with Id: " + studentId);
		studentDAO.deleteStudent(studentId);
		System.out.println("the Student with Id: " + studentId + " has been deleted.");
	}

	private void updateTheStudent(StudentDAO studentDAO) {
		// retrieve student based on the id: primary Key
int studentId = 1;
System.out.println("Gettinh the Student with ID: " + studentId);
Student myStudent = studentDAO.getStudent(studentId);

		// change first name to "scooby"
System.out.println("Updating student with ID: " + studentId);
myStudent.setFirstName("Scoooooby");
		// update the student
studentDAO.updateStudent(myStudent);
System.out.println("Updated succefully: " + studentId);
		// display the updated student
System.out.println(myStudent);


	}

	private void queryForstudentLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.getStudentsByLastName("Araujo");

		for (Student student : students) {
			System.out.println(student);
		}
	}
	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.getAllStudents();

		// display list of students
		for (Student tempstudent : theStudents) {
			System.out.println(tempstudent);
		}

	}
	private void readStudent(StudentDAO studentDAO) {

Student myStudent = new Student();
		// create the student object
		/*System.out.println("Creating new student object .........");
		Student tempStudent = new Student("batlaimous","batlas","batlaimous@gmail.com" );
		// save the student object
		System.out.println(" saving the student ......... ");
		studentDAO.save(tempStudent);*/
		// retrieve student based on the id: primary key
		/*int theId = tempStudent.getId();
		System.out.println(" retrieved student with id " + theId);
		System.out.println(" retrieving student ......... ");*/
		myStudent = studentDAO.getStudent(9);
		// display student
		System.out.println(myStudent);
	}


	private void createMultipleStudents(StudentDAO studentDAO) {
		// create multiple studens
		System.out.println("Creating student .........");
		Student tempStudent1 = new Student("Adriano","Araujo","Adriano@gmail.com" );
		Student tempStudent2 = new Student("Aline","Araujo","Aline@gmail.com" );
		Student tempStudent3 = new Student("Giovanni","Terra","giovanni@gmail.com" );
		Student tempStudent4 = new Student("pedro","littlepai","pedro@gmail.com" );
		Student tempStudent5 = new Student("paulo","ASA","paulo@gmail.com" );
		Student tempStudent6 = new Student("matheus","matrel","matrel@gmail.com" );
		Student tempStudent7 = new Student("Guilerme","Resedence","guilerme@gmail.com" );

		// save the students
		System.out.println(" saving the students ......... ");

		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);
		studentDAO.save(tempStudent5);
		studentDAO.save(tempStudent6);
		studentDAO.save(tempStudent7);

	}
	/*private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating student .........");
		Student tempStudent = new Student("beshoooo","Younan","beshoy.younan@gmail.com" );
		// save the student object
		System.out.println(" saving the student ......... ");
		studentDAO.save(tempStudent);
		// display the id of the saved student
System.out.println(" ID for saved student is " + tempStudent.getId());
	}*/
}
