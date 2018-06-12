package org.spring.core.beans;

public class ObjectPool {
	
	private static final ObjectPool object = new ObjectPool();
	private ObjectPool() {
		
	}
	
	public static ObjectPool getInstance() {
		return object;
	}
	
	public String getValue() {
		return "String Object";
	}
}
