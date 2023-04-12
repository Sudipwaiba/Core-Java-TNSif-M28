package com.tnsif.daytwo;

public class SwitchDemo {

	public static void main(String[] args) {

		char x = 'd';
		switch (x) {
		case 'l':
		case 'L':
			System.out.println("this is digit");
			
		case 'd':
		case 'D':
			System.out.println("this is character");
		default:
			System.out.println("please rerun again");
		}
	}

}
