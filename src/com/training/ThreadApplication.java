package com.training;

public class ThreadApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		Thread obj = new MyThread();
		obj.setName("Shariq");
		obj.start();
		
		
	}

}
