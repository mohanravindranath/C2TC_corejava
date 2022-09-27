/*write a program to check if a number is positive, negative or zero using a nested IF statement.*/
package com.tns.assignments;

import java.util.Scanner;

public class Assignment_prog4 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number");
		int number= input.nextInt();		
		if(number>=0) {
			if(number==0) {
				System.out.println("Entered zero");
			}
			else {
				System.out.println(number+" is a Positive number");
			}
		}
			else {
				System.out.println(number+" is a Negative number");
			}
	}
}
