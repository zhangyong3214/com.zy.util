package com.zy.util.test;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class TestReference {
	private static Map<Integer,Reference> map = new HashMap<Integer,Reference>();

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		for(int i=0;i<1000;i++){
//			map.put(i, new SoftReference<>(new ReferenceObject(i)));
			ReferenceObject ro = new ReferenceObject(i);
			map.put(i, new WeakReference<>(ro));
//			map.put(i,ro);
		}
		int i = 0;
		for(Reference r : map.values()){
			if(r.get()==null){
				i++;
			}
		}
		System.out.println(" 被回收的对象数"+i);
	}
	static class ReferenceObject{
		@SuppressWarnings("unused")
		private byte[] bts ;
		@SuppressWarnings("unused")
		private int i ;
		
		public ReferenceObject(int i){
			this.i = i;
			bts = new byte[1024*1024];
		}
		
	}

}
