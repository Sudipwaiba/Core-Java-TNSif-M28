package com.tnsif.cloneable;

public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {


		Student s1=new Student(100,"ED","Sudip");
		s1.printData();
		
		Student s2=(Student) s1.clone();
		s2.setName("Waiba");
		s2.setRollNo(105);
		s2.setClassName("AA");
		s2.printData();
	}

}
