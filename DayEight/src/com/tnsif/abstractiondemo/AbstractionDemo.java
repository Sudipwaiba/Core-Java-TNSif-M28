package com.tnsif.abstractiondemo;

public class AbstractionDemo {

	public static void main(String[] args) {

//
//		Square s=new Square();
//		s.calArea();
//		s.show();
//		
//		Rectangel r=new Rectangel();
//		r.show();
//		r.calArea();
//		
//		// Dynamic binding
//		
		Shape sh;
		sh=new Square(3.3f);
		sh.calArea();
		sh.show();
		
		sh= new Rectangel(1.9f,20.0f);
		sh.calArea();
		sh.show();
		
	}

}
