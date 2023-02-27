package com.student.management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO EXIT STUDENT");
			
			int choice = Integer.parseInt(input.readLine());
			
			if (choice == 1) {
				//INSERT
				System.out.println("Enter the ID");
				int ID = Integer.parseInt(input.readLine());
				
				System.out.println("Enter the name");
				String name = input.readLine();
				
				System.out.println("Enter the number");
				int number = Integer.parseInt(input.readLine());
				
				System.out.println("Enter the marks");
				int marks = Integer.parseInt(input.readLine());
				
				System.out.println("Enter the city");
				String city = input.readLine();
				
				//Create the object to store the student
				Student st = new Student(ID, name, number, marks, city);
				
				StudentDAO objDao = new StudentDAO();
				boolean value = objDao.insert(st);
				if (value) {
					System.out.println("Data successfully added into the Database!");
				} else {
					System.out.println("Error : Something went wrong!");
				}
			}
			else if (choice == 2){
				//DELETE
			}
			else if (choice == 3) {
				//DISPLAY
			}
			else if (choice == 4) {
				//EXIT
				break;
			}
			else {
				
			}
		}
		
		System.out.println("Bye Bye");
		
	}
}