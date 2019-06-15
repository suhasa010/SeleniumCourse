package com.sfms;

public class MainProgramExecution {
	
	
	
	public static void main(String args[]) {
		Student shinny=new Student("Shinny", 1, 6);
		Student jang=new Student("jang", 2, 6);
		Student kallia=new Student("kallia", 3, 6);
		
		
		shinny.payFees(5000);
		jang.payFees(5000);
		kallia.payFees(5000);
		
		System.out.println(School.getTotalfunds());
		
		
		
	}
}
