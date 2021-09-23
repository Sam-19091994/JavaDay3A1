package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

public class DailyEmpWage {
	
	public static void main (String[] args) {
		
		System.out.println("Welcome");
		//Variables
		int empRatePerHr = 20;
        int is_present = 1;
        int random = ThreadLocalRandom.current().nextInt(0,2);
        
        if (is_present == random) {
        	
        	int empHrs = 8;
        	int salary = empRatePerHr*empHrs;
        	System.out.printf("You have worked for %d Hours and Your Salary is $ %d", empHrs,salary);
        }
        else {
        	int empHrs = 0;
        	int salary = empRatePerHr*empHrs;
        	System.out.printf("You have worked for %d Hours and Your Salary is $ %d", empHrs,salary);
        }
       
        
        
		
		
	}

}
