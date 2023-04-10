package com.tnsif.abstractiondemo;

public class Rectangel extends Shape{
	
	float width , height;
	
	public Rectangel() {
		this.width=2.0f;
		this.height=2.3f;
		
	}
	public Rectangel (float width, float height) {

		this.width=width;
		this.height=height;
	}
	@Override
	void calArea() {
		// TODO Auto-generated method stub
		area=width*height;
	}

}
