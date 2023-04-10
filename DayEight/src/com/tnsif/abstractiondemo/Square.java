package com.tnsif.abstractiondemo;

public class Square extends Shape{

	float side;
	
	
	
	
	public Square() {
		side=2.0f;	}


	//parametrized constructor
	public Square(float side) {
		this.side = side;
	}


	@Override
	void calArea() {
		// TODO Auto-generated method stub
		this.area=side*side;
		System.out.println("this is area "+area);
	}


		

	
	

}
