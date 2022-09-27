/*In the month of October, the temperature on Oct 1st was 30 ℃ and reduced
by two degrees every week. Simulate this scenario using a for loop in Java.
Before simulating this, you should find the final temperature.
Week 1 - 30
Week 2 - 28
Week 3 - 26
Week 4 - 24
Week 5 - 22*/
package com.tns.assignments;

public class Assignment_prog3 {

	public static void main(String[] args) {
		int week=5,temp=30,i;
		for(i=1;i<=week;i++) {
			System.out.println("temp for week "+i+" is "+temp);
		if(i==week) {
			System.out.println("final temp is "+temp);
		}
		temp=temp-2;
		}

	}

}
