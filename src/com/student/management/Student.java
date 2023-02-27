package com.student.management;

public class Student {
	
	private int Id;
	private String name;
	private int phone;
	private float marks;
	private String city;
	
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(int id, String name, int phone, float marks, String city) {
		super();
		Id = id;
		this.name = name;
		this.phone = phone;
		this.marks = marks;
		this.city = city;
	}

	public Student(String name, int phone, float marks, String city) {
		super();
		this.name = name;
		this.phone = phone;
		this.marks = marks;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", phone=" + phone + ", marks=" + marks + ", city=" + city
				+ "]";
	}
	
	
	
	

}
