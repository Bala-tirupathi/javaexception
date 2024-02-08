package com.ExceptionHandling_01;

/* Java default can handle exception but it will terminate the program execution if we want to handle our own to stop the abnormal termination
   then this exception handling concept is useful*/

public class Demo1 {
	public void divide() {
		try {                                    //---> This block for Risky code [example open db connection]
			int n = 10/0;
		}
		catch(ArithmeticException ae){           //---> This block for Handling code [example Reading data]
			System.out.println(ae.toString());  // This will give clear message java.lang.ArithmeticException: / by zero.
			System.out.println(ae.getMessage());
			System.out.println(ae);
			//ae.printStackTrace();             // This method don't need sysout bc default exception handler internally implements that statement
			
			System.out.println("This is arithmetic Exception");
		}
		finally {                               //---> This is for clean up code [example closing db connection irrespective of exception]                           
			System.out.println("This final block will be execute either exception handled or not handled");
		}
		
	}
	
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.divide();
	}

}

/* If we don't know which type of exception will raise the we can write ----> catch(Exception e) but this is not a good practice
 * --> If try block gives an exception then only catch block can work example n = 10/1 here try didn't throw an exception then no work for catch
 * --> TRY is mandatory but FINALLY is an optional, we can write TRY with CATCH or TRY with FINALLY so that CATCH is optional if we have FINALLY
 * --> Single FINAL block also not allowed, only try combination allowed.
 * 
 -----> Throwable is super class of all other exceptions 
 -----> Errors are non recoverable example Jvm crashed by virus, out of memory in system, so errors due to lack of system resource
 
 -----> The Exceptions which are checked by compiler weather programmer handle or not for smooth execution for program at run time is called 
        "Compile time or Checked Exceptions" example :- interrupted exception, file not found exception
        
 -----> The Exceptions which are not checked by compiler those are known as Run time exceptions*/

/* Throwable   -- Checked (Partially checked)
 * Exception   -- Checked (Partially checked)
 * IOException -- Checked (Fully checked)
 * FileNotFound -- Checked (Fully checked)
 * IterruptExce -- Checked (Fully checked)
 * Error        -- Unchecked  
 * RuntimeExcep -- Unchecked 
 * ArithmeticE  -- Unchecked
 * Null pointer -- Unchecked */
 