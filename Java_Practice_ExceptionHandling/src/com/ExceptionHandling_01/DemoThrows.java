package com.ExceptionHandling_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* If we want to communicate with Java for handling exception from a particular method which we throws.
   Actually java can catch run time exception in the execution time without our communication but 
   Compile time exception Java not able to handle so we should communicate with Java like below example*/

public class DemoThrows {

	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Program execution started");
		
		//File file = new File(c:/resume.bala);
		//FileInputStream f = new FileInputStream(file);
		//System.out.println(f);

	}

}
