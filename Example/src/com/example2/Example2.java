package com.example2;

public class Example2 {
	Example2() {
		this("A");
		System.out.println("Default constructor");
	}
	
	Example2(String a) {
		this("A", "B");
		System.out.println("One Parameter " + a);
	}
	
	Example2(String a,String b) {
		this("A", "B", "C");
		System.out.println("Two parameter " + a + " " + b);
	}
	
	Example2(String a,String b,String c) {
		System.out.println("Three parameter "+ a + " " + b + " " +c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 obj = new Example2();
	}

}
