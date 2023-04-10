package com.tnsif.methodoverriding;

public class RBI {

	public float grtROI() {
		return 5.3f;
		
	}
	public void disp() {
		System.out.println("overriding");
		
	}
	
}

class SBI extends RBI{
	
	public float grtROI() {
		return 5f;
		
	}
	
	
}
class Axis extends RBI{
	
	public float grtROI() {
		return 3f;
		
	}
	
	
}
class ICICI extends RBI{
	
	public float grtROI() {
		return 5f;
		
	}
	
	
}