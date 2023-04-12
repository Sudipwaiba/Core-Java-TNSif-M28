package com.tnsif.daythree.encapsulation;

import java.util.Scanner;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your name :");
		String customerName =sc.next();
		System.out.println("Please enter your ID :");
		int customerIdr = sc.nextInt();
		System.out.println("Please enter your City :");
		String customerCity = sc.next();
		
		
		Customer obj = new Customer(customerName, customerIdr, customerCity);
		System.out.println(obj);
		
		
	}

}
