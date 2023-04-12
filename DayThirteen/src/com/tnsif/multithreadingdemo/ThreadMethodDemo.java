package com.tnsif.multithreadingdemo;

public class ThreadMethodDemo {

	public static void main(String[] args) {
		ChildThread t1= new ChildThread(5, "first");
		ChildThread t2= new ChildThread(10, "SECOND");
		System.out.println("current thread :"+ Thread.currentThread());

		
		t1.start();
		t2.start();

		
		Thread.currentThread().setName("parent thread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("current thread :"+ Thread.currentThread());
	try {
		t1.join();
		t2.join(300);
	}catch(InterruptedException e){
		System.err.println(e.getMessage());
		
	}
		
		System.out.println("---END OF MAIN----");
		
		
	
	}

}
