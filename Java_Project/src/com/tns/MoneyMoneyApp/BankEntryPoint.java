package com.tns.MoneyMoneyApp;

public class BankEntryPoint {

	public static void main(String[] args) {
		SavingAcc savingaccObj=new MMSavingsAcc(1234567854, "JOHN", 60000, true);
		CurrentAcc currentaccObj= new MMCurrentAcc(1234567897, "SAM", 25000, 10000);
		savingaccObj.withdraw(60000);
		savingaccObj.toString();
		currentaccObj.withdraw(10000);
		currentaccObj.toString();	
		
	}
	
}
