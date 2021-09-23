package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

public class CasePartTimeEmp {
	public static void main(String[] args) {
		
		//Constants
        final int isPartTime = 0;
        final int isFullTime = 1;
        
        //Variables
        int empRatePerHr = 20;
        int empHr;
        int random = ThreadLocalRandom.current().nextInt(0,3); //Random Variable for values --> 0,1,2
        
        //Switch Case
        switch (random){
        	case isPartTime :
        		empHr = 4;
        		break;
        	case isFullTime :
        		empHr = 8;
        		break;
        	default:
        		empHr = 0;	
        }
        int salary = empHr*empRatePerHr;
        System.out.println(salary);
        		
        
	}

}
