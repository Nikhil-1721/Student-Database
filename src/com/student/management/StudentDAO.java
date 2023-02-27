package com.student.management;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {
	
	private String insertQuery = "INSERT INTO students(ID, name, phone, marks, city) VALUES(?, ?, ?, ?, ?)";
	
	public boolean insert(Student student) {
		
		boolean value = false;
		
		try {
			
			// Create the connection
			Connection connection = Connector.initialize();
			
			// Prepare the Statement
			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setInt(1, student.getId());
			statement.setString(2, student.getName());
			statement.setInt(3, student.getPhone());
			statement.setFloat(4, student.getMarks());
			statement.setString(5, student.getCity());
			
			// Execute the query
			statement.executeUpdate();
			value = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return value;
	}

}
