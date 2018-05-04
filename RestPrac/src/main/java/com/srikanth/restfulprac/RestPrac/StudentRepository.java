package com.srikanth.restfulprac.RestPrac;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

	List<Student> students;
	
	public StudentRepository() {
		students  = new ArrayList<>();
		
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
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
	}
	
	public List<Student> getStudents()
	{
		return students;
	}
	
	public Student getStudentbyID(int StudentID)
	{
		for(Student s : students)
		{
			if(s.getStudentID()==StudentID)
				return s;
		}
		return null;
		
	}
}
