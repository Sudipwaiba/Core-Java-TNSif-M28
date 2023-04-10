package com.tnsif.packagesone;

public class Executor {

	public static void main(String[] args) {


		Base b= new Base();
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
//		b.methodPrivate();
		
		b.varDefault=11;
		b.varProtected=22;
		b.varPublic=33;
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		System.out.println(b instanceof Base); // true or false
		
		Person p= new Person();
	}

}
