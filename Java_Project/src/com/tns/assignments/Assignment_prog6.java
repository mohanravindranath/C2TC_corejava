/**1.write a program using concatenated IF to print the maximum of 3 numbers without using Math.max().*/
package com.tns.assignments;

import java.util.Scanner;

public class Assignment_prog6 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1+ " is greater then "+num2+" and "+num3);
		}
		else if(num2>num3){
			System.out.println(num2+ " is greater then "+num1+" and "+num3);
		}
		else {
			System.out.println(num3+ " is greater then "+num1+" and "+num2);
		}
	}
}
