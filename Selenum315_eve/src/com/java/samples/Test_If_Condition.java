package com.java.samples;

public class Test_If_Condition {
	
	public static void main(String[] args) {
		
		
		int a = 3;
		int b = 3;
		
		if (a==b) {
			System.out.println("a nd b are same");
		}else
		{
			System.out.println(" a and b are not same");
			
		}
		
		String str1 = "ddd";
		String str2 = "ddd";
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("str1 and str2 are same");
		}else {
			System.out.println("str1 and str2 are not same");
		}
		
	}

}
