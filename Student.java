package com.entity;

public class Student 
{
	private String id;
	private String name;
	private String username;
	private String password;
	private String city;
	private String contact;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, String username, String password, String city, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.city = city;
		this.contact = contact;
	}

	
	
	
}
