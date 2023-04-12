package com.tnsif.daythree.encapsulation;

import java.util.Scanner;

// inheritance feature of the oops concept 

public class OopsConceptDemo {
	int serialNum;
	String name;
	int age;
	
public class A extends  OopsConceptDemo{
	void display(int serialNum,String name,int age) {
		System.out.println("serial :"+serialNum+" Name :"+name+" age :"+age );

	}
	
	
}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int serialNum= sc.nextInt();
		String name =sc.next();
		int age = sc.nextInt();
		
		OopsConceptDemo oop= new OopsConceptDemo();
		
		A a= oop.new A();
		a.display(serialNum, name, age);
				
		
	}

}
