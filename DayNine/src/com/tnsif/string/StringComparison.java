package com.tnsif.string;

public class StringComparison {

	public static void main(String[] args) {


		// creating the strings using literals
		
		String s1="TNSIF";
		String s2="TNSIF";
		
		
		// CREATING THE strings using new operator
		
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");

		// == and equals
		
		System.out.println("case 1---> "+s1.equals(s2)); //true ,, equals check the object data and compare
		
		System.out.println("case 2---> "+s1.equals(s3)); //true
		
		System.out.println("case 3--> "+s1==s2); // false  ,, == compares references 
		System.out.println("case 4--> "+s1==s4); // false
		System.out.println("case 3--> "+s3==s4); // false
		
		System.out.println(s1.hashCode());
		
		System.out.println(s1.compareTo("tnsif"));
		
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		
		System.out.println(s1.compareTo(s2));
		
		
		
		
	}

}
