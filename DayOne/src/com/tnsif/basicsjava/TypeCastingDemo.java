
package com.tnsif.basicsjava;

public class TypeCastingDemo {
	public static void main(String[] args) {
		
		
		// widening type casting or implicit(internally) type casting
		
		byte one=10;
		int i=one;
		System.out.println(i);
		
		 float two=23.6f;
		 double d=two;
		 System.out.println(d);
		 
		 char ch='n';
		 int in=ch;
		 System.out.println(in);
		 
		 //narrowing / explicit type casting
		 
		 double s=107.4d;
		 float fOne=(float)s;
		 System.out.println(fOne);
		 
		 long l=234423442L;
		 int num=(int)l;
		 System.out.println(num);
	}

}
