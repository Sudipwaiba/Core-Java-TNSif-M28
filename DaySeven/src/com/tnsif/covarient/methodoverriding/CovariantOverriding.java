package com.tnsif.covarient.methodoverriding;


class Red extends Color{
	//method getColor returns an object of type Red
	protected Red getColor() {
		Color s=new Color();
		return (Red) s;
	}
}

public class CovariantOverriding{
	public static void main(String[] args) {
		Color c1=new Color();
		Color c2=c1.getColor();
		System.out.println(c2);
		
		
	}
}
	