package com.java.inheritance;

public class Test12 implements testb12{

	String str1;
	int a1;
	
	public void b1() {
		System.out.println("print string val : "+ str1);
	}
	
	public void b2() {
		
		System.out.println("print int value : "+ a1);
		
	}

	
	public void g1() {
		System.out.println("this is interface method1 implemented in test12 class");
		
	}

	public void g2() {
		System.out.println("this is interface method2 implemented in test12 class");
		
	}
}
