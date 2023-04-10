package com.tnsif.multithreadingdemo;

public class ThreadDemo {

	public static void main(String[] args) {


		ChildThread t1=new ChildThread(3,"Hi");
		ChildThread t2=new ChildThread(5,"hello");
		
		t1.start();
		t2.start();
		
		System.out.println("======end of the main method");
		
	}

}
