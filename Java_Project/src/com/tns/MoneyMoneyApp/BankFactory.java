package com.tns.MoneyMoneyApp;

public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal,float isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal,float creditLimit);
	
}
