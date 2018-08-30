package com.example.Proyecto.jparest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String lastName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	protected Student() {}
	 
	public Student(int id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return String.format("Student[name='%s', lastName='%s']", name, lastName);
		
	}
	
	
}
