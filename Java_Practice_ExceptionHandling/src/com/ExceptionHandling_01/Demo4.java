package com.ExceptionHandling_01;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {     
		System.out.println("Below sleep method will give interrupt exception(CE) if above throws InterruptedException is not there");
		Thread.sleep(1000);
	}

}
