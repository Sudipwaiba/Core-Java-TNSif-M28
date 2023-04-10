package com.tnsif.packagethree;

public class PrivateConstructor {

	public static void main(String[] args) {

		MyClass m = MyClass.getObject();
		m.setId(12);
		
		MyClass m1=MyClass.getObject();
		System.out.println(m);
		System.out.println(m1);
		
	}

}
