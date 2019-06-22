package com.sfms;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	
	public Teacher(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		School.updateTotalremaining(salary);
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
		School.updateTotalremaining(salary);
	}
	
}
