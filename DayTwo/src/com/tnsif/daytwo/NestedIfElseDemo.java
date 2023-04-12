package com.tnsif.daytwo;

public class NestedIfElseDemo {

	public static void main(String[] args) {

		
		int a=10, b=80, c=3;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
		
		}
		else {
			if(c>b) {
				System.out.println("c is greater");
				
			}
			else {
				System.out.println("b is greater");
			}
		}
	}

}
