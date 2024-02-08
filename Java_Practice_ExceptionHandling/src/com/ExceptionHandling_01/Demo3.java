package com.ExceptionHandling_01;

public class Demo3 {
	public void number() {
		String str = "Bala";
		try {
			int num = Integer.parseInt(str);
		}
		catch(NumberFormatException nfe){
			System.out.println("Here string is not able to conver into integers");
		}
		System.out.println("Remaining code also will execute");
		
		String s = null;
		try {
			System.out.println(s.length());                       // If we Try here with str.length then output will be 4 
		}
		catch(NullPointerException ne) {
			System.out.println("This is null pointer exception");
		}
	}

	public static void main(String[] args) {
		Demo3 obj3 = new Demo3();
		obj3.number();
	}

}
