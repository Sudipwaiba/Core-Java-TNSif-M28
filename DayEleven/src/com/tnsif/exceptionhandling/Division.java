
package com.tnsif.exceptionhandling;

import java.util.Scanner;

public class Division {
	
	public static void divide()
	{
		int a, b, c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		
		int arr[]= {10,20};

		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("the output is "+c);
			System.out.println(arr[c]);
		} 
		catch (ArithmeticException e) {
			System.err.println("Error occured "+e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("array Error occured "+e.getMessage());
		}
		catch(Exception e) {
			System.err.println("Error occured due to  "+e.getMessage());
		}
	}

}
