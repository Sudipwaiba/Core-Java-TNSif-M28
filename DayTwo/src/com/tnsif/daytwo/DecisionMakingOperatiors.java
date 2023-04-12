package com.tnsif.daytwo;

public class DecisionMakingOperatiors {

	public static void main(String[] args) {
		System.out.println("welcome ot decision making world");

		int a=10;
		int b=20;
		if (!((a<b) || (a==b))) {
			System.out.println("False");
		}
		else {
			System.out.println("True");
		}
		
		int c= (10==a)? 1:0;
		System.out.println("it is "+ c);
	}

}
