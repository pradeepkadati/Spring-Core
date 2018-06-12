package org.spring.core.beans;

public class HelloBean {
	
	public void display() {
		System.out.println("am i lazy loaded");
	}
	
	public String  hello() {
		return "Welcome to Spring World";
	}
}
