/*A library charges a fine for books returned late as given below.
Design a program to calculate the fine for N days.*/
package com.tns.assignments;

import java.util.Scanner;

public class Assignment_prog7 {

	public static void main(String[] args) {
		int fine;
		Scanner input= new Scanner(System.in);
		System.out.println("enter day");
		int day=input.nextInt();
		if(day<=5) {
			 fine=1;
			int total= day*fine;
			System.out.println(total);
		}
		else if(day>=5 && day<=10) {
			 fine=5;
			int total= day*fine;
			System.out.println(total);
		}
		else  {
			fine=10;
			int total=day*fine;
			System.out.println(total);
		}
	}
}
