package com.srikanth.restfulprac.RestPrac;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class StudentRepository {

	Connection con = null;
	
	public StudentRepository() {
		
		try{  
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	        con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=JavaTrain;", "sa", "root" );  
	    }catch(Exception e){System.out.println(e);}  
	}
	
	public List<Student> getStudents()
	{
		String sql = "select * from tblStudent";
		
		List<Student> students = new ArrayList<>();
		
		try {
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery(sql);  
			
			while(rs.next()){  
	        	Student mystudent=new Student();  
	            mystudent.setStudentID(rs.getInt(1));  
	            mystudent.setFirstName(rs.getString(2));  
	            mystudent.setLastName(rs.getString(3));  
			
	            students.add(mystudent);
			}
	            
		} catch (SQLException e) {
			
			e.printStackTrace();
		}  
		
		return students;
	}
	
	public Student getStudentbyID(int StudentID)
	{
		Student mystudent = null;  
		 mystudent =new Student();
	    try{  
	        con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=JavaTrain;", "sa", "root" );  
	        PreparedStatement ps = con.prepareStatement("select * from tblStudent where StudentID =" + StudentID);  
	        ResultSet rs = ps.executeQuery();  
	        while(rs.next()){  
	             
	            mystudent.setStudentID(rs.getInt(1));  
	            mystudent.setFirstName(rs.getString(2));  
	            mystudent.setLastName(rs.getString(3));  
	             
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return mystudent;  
	}

	public void create(Student s5) {
		students.add(s5);		
	}
}
