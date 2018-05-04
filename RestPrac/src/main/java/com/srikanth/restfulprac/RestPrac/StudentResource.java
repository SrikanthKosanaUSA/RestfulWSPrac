package com.srikanth.restfulprac.RestPrac;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Student")
public class StudentResource {

	StudentRepository repo = new StudentRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	
	public List<Student> getAllStudents() {
		
		return repo.getStudents();
	}
	

	@GET
	@Path("student/{StudentID}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student getStudentbyID(@PathParam("StudentID") int StudentID) {
		
		return repo.getStudentbyID(StudentID);
	}
	
	/*@POST
	@Path("student")
	public Student CreateNewStudent(Student s5) {
		System.out.println(s5);
		repo.create(s5);
		
		return s5;
	}
	*/
}
