package com.tns.abstraction;

public class Calculator {

	public static void main(String[] args) {
		Addition a=new Addition();
		Subtraction s=new Subtraction();
		a.calculate(2, 3);
		s.calculate(5, 2);

	}

}
