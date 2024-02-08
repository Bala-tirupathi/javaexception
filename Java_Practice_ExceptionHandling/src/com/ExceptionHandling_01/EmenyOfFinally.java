package com.ExceptionHandling_01;

public class EmenyOfFinally {

	public static void main(String[] args) {
		System.out.println("execution started");
		try {
			System.out.println("Checking");
			System.exit(0);
		}
		
		catch(Exception e){
			System.out.println("Nothing");
		}
		
		finally {
			System.out.println("Naku pyna exit ane enemy vundhi aadhi na frnd Jvm ni stop chesindhi so nen execute avvalenu");
		}

	}

}

/* We can overcome finally block by stopping(exit) the jvm explicitly
 * For Zero*/
