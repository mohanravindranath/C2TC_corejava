package com.tns.oops;

public class Static_key {
	static int a=10;
	
	static{
		System.out.println("This is static block");
	}
	
	Static_key(){
		System.out.println("This is constructor");
	}
	static void method() {
		System.out.println("this is static method");
	}

	public static void main(String[] args) {
		int b=a;
		Static_key.method();
		Static_key obj=new Static_key();
		System.out.println(Static_key.a); 
		System.out.println(b);

	}

}
