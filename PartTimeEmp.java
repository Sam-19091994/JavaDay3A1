package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

public class PartTimeEmp {
	public static void main (String[] args) {
		
		//Variables
		int empRatePerHr = 20;
        int isPartTime = 0;
        int isFullTime = 1;
        int random = ThreadLocalRandom.current().nextInt(0,3);
        int empHrs = 0;
        
        //Conditional
        if (isPartTime == random) {
        	empHrs = 4;
        }
        else if (isFullTime == random) {
        	empHrs = 8;
        }
        else {
        	empHrs = 0;
        }
        int salary = (empRatePerHr*empHrs);
        System.out.printf("You Working Hours are %d \n",empHrs);
        System.out.println("Your Salary is " + salary);
        
	}

}
