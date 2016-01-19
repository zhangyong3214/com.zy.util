package com.zy.util.test;

public class TestSyn {

	public static int count = 0;
	
	public void inCount(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			count += 1;
	}
	public static void main(String[] args) {
		for(int i = 1; i <= 50;i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					new TestSyn().inCount();
				}
			}).start();
		}
		System.out.println("now the count is :"+TestSyn.count);
	}

}
