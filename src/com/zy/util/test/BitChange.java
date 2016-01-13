package com.zy.util.test;

public class BitChange {
	public static void main(String[] args) {
		testLeftMove();
	}
	
	/**左移运算<<
	 * 做一过程是不带循环的,最右边补零，一次相当于乘2,而且因为是位运算，效率极高
	 * 0000 0001 << 1   ----------> 0000 0010
	 */
	public static void testLeftMove(){
		long move = 2;
		//
		
		System.out.println("|-----------------整形右移----------------|");
		long iold = 202;
		System.out.println(iold+"向左移动"+move+"位后，iold="+(iold<<move));
		System.out.println("|-----------------整形右移----------------|");
		System.out.println("|-----------------字符串右移----------------|");
		String ostr = "test";
//		ostr.get
//		System.out.println(iold+"向左移动"+move+"位后，iold="+(ostr<<move));
		System.out.println("|-----------------整形右移----------------|");
	}
	
	
	public static void testRightMove(){
		int move = 2;
		System.out.println("|-----------------整形右移----------------|");
		
		
		System.out.println("|-----------------整形右移----------------|");
	}
}
