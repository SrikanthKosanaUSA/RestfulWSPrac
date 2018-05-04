package com.srikanth.restfulprac.RestPrac;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Student")
public class StudentResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent() {
		Student s1 = new Student();
	
		s1.setStudentID(1);
		s1.setFirstName("One");
		s1.setLastName("EKH");
		
		return s1;
		
	}
}
