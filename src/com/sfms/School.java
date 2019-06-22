package com.sfms;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String schoolname;
	private List<Teacher> teachers=new ArrayList<Teacher>();
	private List<Student> students =new ArrayList<Student>();
	private static int totalfunds=0;
	private static int totalremaining = 0;
	
	public static int getTotalfunds() {
		return totalfunds;
	}
	
	public static int getTotalremaining() {
		return totalremaining;
	}
	
	public static void updateTotalfunds(int fund) {
		totalfunds += fund;
	}
	
	public static void updateTotalremaining(int fund) {
		totalfunds = getTotalfunds()- fund;
	}
	
	
}
