package com.training;

public class ThreadApplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YourThread obj = new YourThread();
		
		Thread th1 = new Thread(obj,"Shariq");
		Thread th2 = new Thread(obj,"Krishna");
		Thread th3 = new Thread(obj,"Suresh");
		
		th1.start();
		
		th2.start();
		
		th3.start();
	}

}
