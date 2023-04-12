package com.tnsif.multithreadingdemo;

public class RunnabelDemo {

//	public static void main(String[] args) {
//
//		UsingRunnable ur=new UsingRunnable(10,1,"hello");
//	}
	
	public static void main(String[] args) {
		Runnable r1=new Runnable() {	// functional interface
			public void run() // anonymous clas
			{
				System.out.println("runnable with anonymous class");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
	
	
	// lambda expression 
		Runnable r2=()->System.out.println("Runnable with lambda expression");
		
		new Thread(r2).start();
	}
	
	

}
