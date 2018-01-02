package com.demo.threaddemo;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("from MyRunnable : i= "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}

}
