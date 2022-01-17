package student.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import student.restapi.entity.Student;
import student.restapi.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService studentService;
	
	
	//add student
	@RequestMapping(method=RequestMethod.POST,value="/addstudent")
	public String addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
		return student.getName()+" added successfully";
	}
	
	//get all students
	@RequestMapping(method=RequestMethod.GET,value="students")
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudent();
	}
	

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	public StudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	

}
