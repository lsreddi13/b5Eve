package com.java.vars;

public class DemoVars {

	//static variables
	static String name = "sasi";
	static int a = 45;
	static double b = 45.5;
	static boolean c = true;
	
	//instance variables
	 String name2 = "sasi";
	 int a2 = 45;
	 double b2 = 45.5;
	 boolean c2 = true;
	
	 
	 public void test1() {
			
			System.out.println(name2);

			System.out.println(a2);
			
			System.out.println(b2);
			
			System.out.println(c2);
	 }
		
	public static void main(String[] args) {			
		
		System.out.println(name);

		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
		DemoVars dv = new DemoVars();
		
		dv.test1() ;
		
		System.out.println(dv.name2);

		System.out.println(dv.a2);
		
		System.out.println(dv.b2);
		
		System.out.println(dv.c2);

		
	}
	
	
}
