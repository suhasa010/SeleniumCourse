package com.sfms;

public class Student {
	private String name;
	private int rollnum;
	private int standard;
	private int totalfees= 30000;
	private int remainingFees;
	private int fees=0;
	
	Student(String name,int rollnum,int standard)
	{
		this.name=name;
		this.rollnum=rollnum;
		this.standard=standard;
		
	}
	
	public int getFees() {
		return fees;
	}
	public String getName() {
		return name;
	}
	public int getRollnum() {
		return rollnum;
	}
	
	public int getStandard() {
		return standard;
	}
	

	public void payFees(int paidfees) {
		this.fees=fees+paidfees;
		School.updateTotalfunds(paidfees);
	}
	
	public void remainingFees(int fees) {
		this.remainingFees=totalfees-fees;
		
	
	}
	
	public void setStandard(int standard) {
		this.standard = standard;
	}
	

}
