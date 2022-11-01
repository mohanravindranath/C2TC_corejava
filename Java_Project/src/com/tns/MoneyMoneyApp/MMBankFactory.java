package com.tns.MoneyMoneyApp;

public class MMBankFactory extends BankFactory {
	
	public MMSavingsAcc getNewSavingAcc(int AccNo, String accNm, float accBal,float isSalaried) {
		MMSavingsAcc obj=new MMSavingsAcc(12345678, "JOHN", 25000, false);
		System.out.println(obj);
		return obj;
	}
	
	public MMCurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc obj=new MMCurrentAcc(12345678, "JOHN", 25000, 10000);
		System.out.println(obj);
		return obj;	
	}
	
}
