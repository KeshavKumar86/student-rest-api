package student.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.restapi.entity.Student;
import student.restapi.repository.StudentRepository;

@Service
public class StudentService {
   @Autowired
	private StudentRepository studentRepository;
   
   //get all student
   public List<Student> getAllStudent()
   {
	   return studentRepository.findAll();
   }
   
   //add student
   public String addStudent(Student student)
   {
	   studentRepository.save(student);
	   return student.getName()+" added successfully";
   }
   

public StudentService() {
	super();
	// TODO Auto-generated constructor stub
}

public StudentService(StudentRepository studentRepository) {
	super();
	this.studentRepository = studentRepository;
}

public StudentRepository getStudentRepository() {
	return studentRepository;
}

public void setStudentRepository(StudentRepository studentRepository) {
	this.studentRepository = studentRepository;
}
   
   
	
}
