package com.srikanth.restfulprac.RestPrac;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Student")
public class StudentResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getAllStudents() {
		Student s1 = new Student();
	    s1.setStudentID(1);
		s1.setFirstName("One");
		s1.setLastName("EKH");
		
		Student s2 = new Student();
	    s2.setStudentID(2);
		s2.setFirstName("Two");
		s2.setLastName("Dho");
		
		Student s3 = new Student();
	    s3.setStudentID(3);
		s3.setFirstName("Three");
		s3.setLastName("Theen");
		
		List<Student> studentslist = Arrays.asList(s1, s2, s3);
		
		
		return studentslist;
		
	}
}
