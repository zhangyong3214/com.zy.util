package com.zy.util.test;

public class LongTest {
	public static void main(String[] args) {
//		long a = 4194000000l;//东经
		long a = 1427400000l;//北纬
		double b = 36000000.0;
		double c = a/b;
		String result = String.format("%.11f", c);
		System.out.println(a+"/"+b+"="+c);
		System.out.println("result:"+result);
	}
}
