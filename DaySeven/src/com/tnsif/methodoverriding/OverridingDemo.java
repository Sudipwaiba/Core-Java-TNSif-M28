package com.tnsif.methodoverriding;

public class OverridingDemo {

	public static void main(String[] args) {

		RBI r;
		
		
		
	

		r=new RBI();
		r.disp();
		System.out.println(r.grtROI());
		
		r=new Axis();
		System.out.println(r.grtROI());
		
		r=new ICICI();
		System.out.println(r.grtROI());
		r=new SBI();
		System.out.println(r.grtROI());
		
	}

}
