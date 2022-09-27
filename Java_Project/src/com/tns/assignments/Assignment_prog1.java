/*Write a Java program to check if a number is a multiple of 3 or otherwise.*/
package com.tns.assignments;

import java.util.Scanner;

public class Assignment_prog1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter number");
		int num=input.nextInt();
		int mul=num%3;
		if(mul==0) {
			System.out.println(num+" is multiple of 3");
		}
		else {
			System.out.println(num+" is not multiple of 3");
		}	

	}

}
