package com.tns.MoneyMoneyApp;

public class MMCurrentAcc extends CurrentAcc{
	
	public MMCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		super(AccNo, accNm, accBal, creditLimit);
	}
	
	@Override
	public float deposite(float deposite) {
		return deposite;
	}
	
	public void withdraw(float withdraw) {
		System.out.println("\nThis is MMCurrent Account class");
		if(withdraw<(getAccBal()+deposite(10000)) && getCreditLimit()<getAccBal()) {
			System.out.println("unable to process");
		}
		else {
			System.out.println("transaction sucessfull");
		}
	}
	public String toString() {
		System.out.println("This is toString method in MMCurrentAcc");
		System.out.println("AccNm:"+getAccNm()+"\nAccNo: "+getAccNo()+"\nDepositeAmt: "+deposite(10000)+"\nAccBal: "+(getAccBal()+deposite(10000))+"\nCrediteLimit: "+getCreditLimit());
		return "AccNm:"+getAccNm()+"\nAccNo: "+getAccNo()+"\nDepositeAmt: "+deposite(10000)+"\nAccBal: "+(getAccBal()+deposite(10000))+"\nCrediteLimit: "+getCreditLimit();
	}
	
}
