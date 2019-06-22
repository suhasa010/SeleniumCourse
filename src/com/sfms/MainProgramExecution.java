package com.sfms;

public class MainProgramExecution {
	
	
	
	public static void main(String args[]) {
		Student shinny=new Student("Shinny", 1, 6);
		Student jang=new Student("jang", 2, 6);
		Student kallia=new Student("kallia", 3, 6);
		
		
		shinny.payFees(5000);
		jang.payFees(5000);
		kallia.payFees(5000);
		
		System.out.println("Total Fund Of School is : "+School.getTotalfunds());
		
		Teacher promod =new Teacher(1234,"Promod",1000);
		
		System.out.println("Total fund of school after paying the salary : "+ School.getTotalfunds());
		
		kallia.payFees(15000);
		
		System.out.println("Total Fund Of School is : "+School.getTotalfunds());
		promod.setSalary(1000);
		System.out.println("Total fund of school after paying the 2nd salary : "+ School.getTotalfunds());
		
		
		
	}
}
