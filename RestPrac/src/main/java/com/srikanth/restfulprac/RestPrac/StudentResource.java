package com.srikanth.restfulprac.RestPrac;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Student")
public class StudentResource {

	StudentRepository repo = new StudentRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getAllStudents() {
		
	
		
		return repo.getStudents();
		
	}
}
