package com.demo.threaddemo;

public class MyThread extends Thread {

	int iterations=5;
	@Override 
	public void run(){
		try {
			for(int i=0;i<iterations; i++){
				System.out.println("from MyThread : "+ (i+1));
				sleep(3000);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}
	}
	
}
