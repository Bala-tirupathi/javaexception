package com.ExceptionHandling_01;

public class IDemo {

	public static void main(String[] args) {
		bala();
	}
	public static void bala() {
		tirupathi();
		System.out.println(20/0);
	}
	public static void tirupathi() {
		System.out.println("Hello");                   // Hello will print but remaining all terminated by jvm bc no exception code to handle 
	}
	
	// why we need to handle exception ?
	
	/* public static void main(String[] args) {
	   System.out.println("Open db connection");     // This we get as output 
	   System.out.println(10/0, "Read data");        // This will give exception so db close statement will not execute (abnormal termination)
	   System.out.println("Close db connection); */  // Here we are wasting a db connection for this reason we need to handle exception
	
       // This closing db connection we can write inside finally block bc this block execute irrespective of Exception
}
