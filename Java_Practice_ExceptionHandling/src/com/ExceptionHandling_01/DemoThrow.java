package com.ExceptionHandling_01;

/* If exception is a serious exception the we need to stop the execution, we need to write lot of code for that but 
 * if we "throw" that serious exception to Java then java can handle that exception and stopping that execution*/

public class DemoThrow {
	public void divide() {
		try {
			int n = 10/0;
		}
		catch(ArithmeticException ae){
			System.out.println(ae.toString());
			throw ae;                                               // By this throw Java can catch this ae that stops the execution
			//System.out.println("This code will not execute bc we already throw an exception to Java so finally block only will execute");
		}
		finally {                                                         
			System.out.println("This final block will be execute either exception handled or not handled");
		}
		
	}

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.divide();

	}

}
