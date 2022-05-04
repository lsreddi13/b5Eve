package com.java.inheritance;

public class GTest1 implements GTest2 {
	
	public static void main(String[] args) {
		GTest1 dd = new GTest1();
		dd.testGt1();
		dd.testGt2();
	}
	
	public void testGt2() {
		
		System.out.println("ddddd");
		
	}

	
	public void testGt1() {
		System.out.println("aaaaa");
		
		
	}

}
