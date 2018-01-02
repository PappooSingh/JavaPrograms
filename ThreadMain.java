package com.demo.threaddemo;

public class ThreadMain {
	public static void main(String[] args){
		int iterations=3;
		MyThread myThread= new MyThread();
		myThread.start();
		for(int i=0;i<iterations;i++){
			System.out.println("From Main class: i= "+(i+1));
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
		MyRunnable myRunnable= new MyRunnable();
		new Thread(myRunnable).start(); 
	}

}
