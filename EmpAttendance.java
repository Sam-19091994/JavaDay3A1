package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

public class EmpAttendance 
{
    public static void main( String[] args )
    {
    	System.out.println("Welcome");
    	
    	//Variables
        int is_present = 1;
        int random = ThreadLocalRandom.current().nextInt(0,2);
        
        System.out.println(random);
        
        if (is_present == random) {
        	System.out.println("The Employee is present");
        }
        else {
        	System.out.println("The Employee is absent");
        }
        
        	
        
        
    }
}
