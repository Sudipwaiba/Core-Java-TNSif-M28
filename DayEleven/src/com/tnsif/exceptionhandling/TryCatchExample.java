package com.tnsif.exceptionhandling;

public class TryCatchExample {
	
	static void divide(int x, int y) {
		
	
			int z;
			try {
				z=x/y;
				System.out.println("i am in try bolck");
				System.out.println(z);
			} catch (ArithmeticException e) {
				System.out.println("i am in catch bolck");

				System.out.println( "you have error due to  "+ e.getMessage());
			}
		
	
	}

}
