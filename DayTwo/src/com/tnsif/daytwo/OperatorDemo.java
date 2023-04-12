package com.tnsif.daytwo;

public class OperatorDemo {
public static void main(String[] args) {
	int a=10,b=20,c=10;
	
	System.out.println("a="+a+" "+"b= "+b+" c= "+c);
	
	++a;
	int x=++a +b + c--;
	System.out.println(x);
	
	int y= --x +a +c;
	System.out.println(y);
}
}