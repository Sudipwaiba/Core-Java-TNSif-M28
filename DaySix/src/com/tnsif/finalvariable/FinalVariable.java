package com.tnsif.finalvariable;

public class FinalVariable {
	
	final int x=5;
	
	final static int y;
	
	final static int z=10;
	
	void change() {
//		x=44;   // x, y variable is already initialized with final keywork that is the reason it is showing error
//		
//		y=23;
	}
	
	static {            // static bolck execute first  , 
		y=30;
//		z=22;
	}

	public static void main(String[] args) {

		
		
		
	}

}
