package com.tns.WeekendAssignments;

public class ForWhileDoLoops {

	public static void main(String[] args) {
		// for loop
		System.out.println("for loop");
		for(int i=1,j=1; i<10||j<10;i++,j++)
		{
		j++;
		System.out.println("i= "+i+" and j= "+j);
		}

		// while loop
		System.out.println("\nwhile loop");
		int i=1,j=1;
		while(i<10 || j<10)
		{
		i++; j++;
		System.out.println("i= "+i+" and j= "+j);
		}
		
		// Do while loop
		System.out.println("\nDo while loop");
		int a = 1, b = 1;
		do {
		a++;
		b++;
		System.out.println("a= " + a +" and b= " + b);
		} while (a < 10 || b < 10);

	}

}
