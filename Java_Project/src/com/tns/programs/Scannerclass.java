package com.tns.programs;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
Scanner input= new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=input.nextLine();
		
		System.out.println("Enter age");
		int age=input.nextInt();
		
		System.out.println("Enter Gender");
		char gender=input.next().charAt(0);
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("gender: "+gender);

	}

}
