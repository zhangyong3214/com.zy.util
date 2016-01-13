package com.zy.util.test;

import java.util.UUID;

public class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str = UUID.randomUUID().toString();
		while(true){
			System.out.println(">>>>>>>>线程开始...."+str);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">>>>>>>>线程结束...."+str);
		}
		
	}

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread1());
		Thread thread2 = new Thread(new MyThread1());
		thread1.start();
		thread2.start();
	}
}
