/*To foster a sense of water conservation, the water department has an annual water tax
policy. The rates are based on the water consumption of the consumer. The tax rates are as
follows:*/
package com.tns.assignments;

import java.util.Scanner;

public class Assignment_prog5 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the amount of water consumption");
		int wc=input.nextInt();
		if(wc<=45) {
			System.out.println("No Tax");
		}
		else if(wc>45 && wc<=75) {
			System.out.println("water consumed: "+wc+ " Total rate: 475rs");
		}
		else if(wc>75 && wc<=125) {
			System.out.println("water consumed: "+wc+ " Total rate: 750rs");
		}
		else if(wc>125 && wc<=200) {
			System.out.println("water consumed: "+wc+ " Total rate: 1225rs");
		}
		else if(wc>200 && wc<=350) {
			System.out.println("water consumed: "+wc+ " Total rate: 1650rs");
		}
		else {
			System.out.println("water consumed: "+wc+ " Total rate: 2000rs");
		}

	}

}
