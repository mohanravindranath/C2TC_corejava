package com.tns.WeekendAssignments;

public class BreakAndContinue {

	public static void main(String[] args) {
		System.out.println("continue;");
		for(int i=1; i<=10; i++){
			if(i == 5){
				continue; // break;
				}
			System.out.println(i);
			}
		
		System.out.println("\nbresak;");
		for(int j=1; j<=10; j++){
			if(j == 5){
				break;
				}
			System.out.println(j);
			}
		}
	}
