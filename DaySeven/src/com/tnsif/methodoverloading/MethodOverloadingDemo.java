package com.tnsif.methodoverloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {


		System.out.println(Maths.addition(21,20));
		System.out.println(Maths.addition(1, 2, 2));
		System.out.println(Maths.addition(23.2f, 21.4f));
		System.out.println("method overloading");
		
		Point p=new Point();
		System.out.println(p);
		
		p=new Point(1);
		System.out.println(p);
		
		p=new Point(1,2);
		System.out.println(p);
	}

}
