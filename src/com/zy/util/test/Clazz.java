package com.zy.util.test;

import java.util.Hashtable;

public class Clazz {
	private final Hashtable<String,String> idKeys = new Hashtable<String,String>();
	private final Hashtable<String,String> cache = new Hashtable<String,String>();
	
	//d读取id中的key
	@SuppressWarnings("unused")
	private String getKey(String id){
		synchronized(Clazz.class){
			if(idKeys.contains(id)){
				return idKeys.get(id);
			}
			idKeys.put(id, id);
			return id;
		}
		
	}
}
