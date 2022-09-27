/*Write a Java program that checks the time (given in a 24 Hour format) and turns
on the light switches in a smart home (program has to display lights on or lights
off).*/
package com.tns.assignments;

import java.util.Scanner;

public class Assignment_prog2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter time");
		float time=input.nextFloat();
		if(time<6 || time>=18) {
			System.out.println("switch on the light");
		}
		else {
			System.out.println("switch off the light");
		}
	}
}
