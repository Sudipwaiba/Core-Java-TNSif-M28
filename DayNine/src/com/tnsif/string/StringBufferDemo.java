package com.tnsif.string;

public class StringBufferDemo {

	public static void main(String[] args) {


		// create object of string buffer
		
		StringBuffer sb=new StringBuffer("Hello ALL");
		
		System.out.println(sb);
		
		System.out.println(sb.append(" class"));
		
		System.out.println( sb.insert(6, "a"));
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		System.out.println(sb.delete(2, 6));
		
		System.out.println(sb.reverse());
		
		
		
		
		
	}

}
