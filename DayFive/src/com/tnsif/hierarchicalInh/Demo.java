package com.tnsif.hierarchicalInh;

public class Demo {

	public static void main(String[] args) {


		Person p=new Person();
		
		System.out.println("person details:");
		System.out.println(p);
		
		Person p1;
		
		p1=new Person("sudip","bengaluru");
		if(p1 instanceof Person)
			System.out.println("person details are "+p1);
		
		p1 = new Employee("Sudip","bengaluru",101, 8700f,"hr");
		if(p1 instanceof Employee)
			System.out.println("person details are"+p1);
		
		
			
	}

}
