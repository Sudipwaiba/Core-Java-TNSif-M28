package com.tnsif.daytwelveexception;

import java.util.Scanner;

public class UsingThrowDemo {
	static int acceptNumber() throws ArithmeticException
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		return num;
	}

	public static void main(String[] args) {
		
		int per;
		System.out.println("Enter you percentage: ");
		per=acceptNumber();
		
		try
		{
			if(per<0) {
				throw new ArithmeticException("Percentage should not be negative");
			}
			else if(per>100) {
				throw new ArithmeticException("Percentage should not be greater than 100");
				
			}
			else {
				System.out.println("valid percentage "+per);
			}
		}
		catch(ArithmeticException e){
			System.err.println("Error "+e.getMessage());
		}
	}

}
