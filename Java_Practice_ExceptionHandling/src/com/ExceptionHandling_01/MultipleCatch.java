package com.ExceptionHandling_01;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		
//		catch(Exception e){
//			System.out.println("Exception handling done");
//		}
		
		catch(ArithmeticException ae) {
			System.out.println("First we need to give child exception only otherwise we will get like already exception handled");
		}
		catch(Exception e){
			System.out.println("Exception handling done");     // After child exception we can give Parent exception so other than ae will handle
		} 

	}

}

/* If we write two catch blocks for Arithmetic exception then we will get compile time error
 * If we write first parent exception and then child exception as above there we will get compile time error*/
 