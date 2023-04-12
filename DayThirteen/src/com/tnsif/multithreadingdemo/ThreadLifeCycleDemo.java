package com.tnsif.multithreadingdemo;

public class ThreadLifeCycleDemo {
 
	public void run() {
		System.out.println("in side run() thread is alive or not ? "+ this.isAlive());
		int num =0;
		while (num<4) {
			num++;
			System.out.println("num = "+num);
			try{
				Thread.sleep(500);
				System.out.println("in not runnalbe stage, thread is alive or not ?"+ this.isAlive());
			}
			catch(InterruptedException e) {
				
			}
		}
	}
	
	private String isAlive() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
Thread mythread=new Thread();

		
	}

}
