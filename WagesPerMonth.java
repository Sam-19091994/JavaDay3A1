package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

public class WagesPerMonth {
	public static void main(String[] args) {
		
		//Variables
		int random = ThreadLocalRandom.current().nextInt(0,3);
		int Full_Time=1;
	    int Part_Time=2;
		int Wage_per_hr=20;
		int Working_days_per_Month=20;
		int salary=0;
		int emphrs=0;
		
		for ( int days=1; days<=Working_days_per_Month; days++ ) {
			int EmplCheck=ThreadLocalRandom.current().nextInt(0,3);
			
			if ( EmplCheck == Full_Time ) {
				emphrs=8;
			}
			else if ( EmplCheck == Part_Time ) {
				emphrs=4;
			}
			else {
				emphrs=0;
			}
			int Emp_Wages=( emphrs * Wage_per_hr );
		    salary=(salary + Emp_Wages);		   	
		}
		System.out.printf("Employees Salary Per Month: %d", salary); 
			   
			
	}

}
