package com.java.samples;

public class DemoVars {

	String str1 = "value1"; // global var

	int age = 45; // global var

	public void test1() {
		int sal = 40000; // local
		String company = "abc"; // local var
		System.out.println(str1 + company + sal);
	}

	String name = "xyz"; // global

	public void test2() {

		System.out.println(str1 + age);
	}

	public static void main(String[] args) {
		DemoVars obj = new DemoVars();
		
		obj.test1();
		obj.test2();
		
		String mystringValue = obj.str1;
		System.out.println( "---------  " + mystringValue);
	}

}
