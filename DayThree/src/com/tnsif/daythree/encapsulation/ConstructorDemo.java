package com.tnsif.daythree.encapsulation;

public class ConstructorDemo {
	 String studentName= "Sudip Waiba";
	int id = 27;
	String collegeName="HKBK College Of Engineering";
	public ConstructorDemo() {
		System.out.println("Hello ! welcome to the constructor world .");
		System.out.println("StudentName : "+studentName+" id :" +id+" CollegeName : "+collegeName);
		System.out.println("");
	}

	public ConstructorDemo(String studentName, int id, String collegeName) { // parameterized constructor
		super();
		this.studentName = studentName;
		this.id = id;
		this.collegeName = collegeName;
		System.out.println(" ");
		System.out.println("StudentName : "+studentName+" id :" +id+" CollegeName : "+collegeName);
		System.out.println(" ");
		}


	public static void main(String[] args) {
	
//		String studentName;
//		int id;
//		String collegeName;
		ConstructorDemo obj = new ConstructorDemo();
		System.out.println(obj);
	
		ConstructorDemo obj2= new ConstructorDemo("Priti", 12," Engg");
		System.out.println(obj2);
	}

}
