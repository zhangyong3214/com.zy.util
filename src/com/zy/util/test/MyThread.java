package com.zy.util.test;

public class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("myThread run..."+currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		MyThread thread1 = new MyThread();
		thread.start();
		thread1.start();
	}
}
