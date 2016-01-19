package com.zy.util.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * final使用方法的探索
 * @author zhangyong5
 *
 */
public class TestFinal {
	final double PI = 3.14;//在定义时候就赋值，以后再也不能修改
	final int i;//定义时候并没有赋值,在使用初次需要赋值,而且只能够赋值一次
	@SuppressWarnings("rawtypes")
	final List list;//
	
	TestFinal(){
		i = 100;
		list = new LinkedList<>();
	}

	@SuppressWarnings("rawtypes")
	public TestFinal(int i, List list) {
		this.i = i;
		this.list = list;
	}
	
	/**
	 * 虽然通过final修饰了StringBuffer
	 * 我们依然可以修改sb的内容,
	 * 但是我们不能进行sb对象的重新初始化
	 * @param sb
	 */
	public void test(final StringBuffer sb){
		sb.append("test");
		//The final local variable sb cannot be assigned.
		//It must be blank and not using a compound assignment
//		sb = new StringBuffer("gaga");
		System.out.println(sb.toString());
	}
	public void test(final String sb){
//		sb.append("test");
//		sb = "test";
		//The final local variable sb cannot be assigned.
		//It must be blank and not using a compound assignment
//		sb = new StringBuffer("gaga");
		System.out.println(sb.toString());
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TestFinal tf = new TestFinal();
		tf.list.add(new TestFinal());
		System.out.println("i:"+tf.i+";List type:"+tf.list.getClass());
		tf = new TestFinal(25, new ArrayList<>());
		tf.list.add(new TestFinal());
		System.out.println("i:"+tf.i+";List type:"+tf.list.getClass());
		tf.test(new StringBuffer("hehe "));
	}
	
	volatile long a = 1l;
	
}
