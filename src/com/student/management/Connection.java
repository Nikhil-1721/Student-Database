package com.student.management;
import java.sql.Connection;
import java.sql.DriverManager;

 class Connector {         // This class is responsible to create and return the connection object
	
	 static Connection connection;
	 private static final String USERNAME = "root";
	 private static final String PASSWORD = "Nikhil_2127";
	 private static final  String URL = "jdbc:mysql://localhost:3306/student_DB";
	 
	 public static Connection initialize() {
		 
		 try {
			 //Load and Register the Driver
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 //Establish the Connection
			 connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 
		return connection;
		 
		 
	 }
	
}
