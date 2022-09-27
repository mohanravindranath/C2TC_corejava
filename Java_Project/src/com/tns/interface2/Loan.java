package com.tns.interface2;

public class Loan implements Home, Car, Education{
	public void homeloan() {
		System.out.println("Rate of interest on home loan is 8.5%");
	}
	public void carLoan() {
		System.out.println("Rate of interest on car loan is 9.25%");
	}
	public void educationLoan(){
		System.out.println("Rate of interest on Education loan is 10.45%");
	}

	public static void main(String[] args) {
		Loan obj=new Loan();
		obj.homeloan();
		obj.carLoan();
		obj.educationLoan();
		

	}

}
