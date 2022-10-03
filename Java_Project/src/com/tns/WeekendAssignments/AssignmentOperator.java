package com.tns.WeekendAssignments;

public class AssignmentOperator {

	public static void main(String[] args) {
		int x = 4;
		//x += 5; // x = x + 5
		//x -= 5; // x = x - 5

		//x *= 5; // x = x * 5
		//x /= 4; // x = x / 4
		//x %= 5; // x = x % 5
		System.out.println("[x += 5 // x = x + 5] :"+(x+=5));
		System.out.println("[x -= 5 // x = x - 5] :"+(x-=5));
		System.out.println("[x *= 5 // x = x * 5] :"+(x*=5));
		System.out.println("[x /= 4 // x = x / 4] :"+(x/=4));
		System.out.println("[x %= 5 // x = x % 5] :"+(x%=5));

	}

}
