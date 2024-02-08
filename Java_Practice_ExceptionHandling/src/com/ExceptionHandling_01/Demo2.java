package com.ExceptionHandling_01;

public class Demo2 {
	public void arrays() {
		try {
			int arr[] = new int[5];
			arr[6] = 15;
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("Array index exceeds exception");
		}
		System.out.println("Handled above exception");
	}

	public static void main(String[] args) {
		Demo2 obj2 = new Demo2();
		obj2.arrays();
	}

}

/* If we are not given ArrayIndexOutOfBoundsException or Exception in catch block then exception is not handled and 12 line also not able to execute
 * So that we should give that respective exception in the catch block*/

