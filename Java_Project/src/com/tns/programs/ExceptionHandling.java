package com.tns.programs;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*		int d=0;
		int a=42/d;
		System.out.println("will not be printed"); */
		
		int d=0,a;
		try {
			a=42/d;
			System.out.println("will not be printed");
		}
		catch(ArithmeticException e){
			//catch(Exception e){
			System.out.println("Division by zero(Error discription)");
		}
		System.out.println("This will get printed");

	}

}
