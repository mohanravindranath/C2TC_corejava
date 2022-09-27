package com.tns.assignments;

import java.util.Scanner;

public class Assign_Commission {
	String name;
	String address;
	long phone_no;
	float sales_amount;
	float commission;
	
	public void emp_Details() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=input.nextLine();
		System.out.println("Enter Address: ");
		address=input.nextLine();
		System.out.println("Enter Phone_no: ");
		phone_no=input.nextLong();
		System.out.println("Enter Sales_amount: ");
		sales_amount=input.nextFloat();
		System.out.println("Name: "+name+"\nAddress: "+address+"\nPhone_no: "+phone_no+"\nSales_amount: "+sales_amount);
	}
	
	public void commission() {
		//float commission;
		if(sales_amount>=100000) {
			commission=(sales_amount*10)/100;
			System.out.println("commission for "+sales_amount+" is "+commission);
		}
		else if(sales_amount>=50000 && sales_amount<100000) {
			commission=(sales_amount*5)/100;
			System.out.println("commission for "+sales_amount+" is "+commission);
		}
		else if(sales_amount>=30000 && sales_amount<50000) {
			commission=(sales_amount*3)/100;
			System.out.println("commission for "+sales_amount+" is "+commission);
		}
		else {
			System.out.println("No commission for "+sales_amount);
		}
	}

	public static void main(String[] args) {
		Assign_Commission obj=new Assign_Commission();
		obj.emp_Details();
		obj.commission();
	

	}

}
