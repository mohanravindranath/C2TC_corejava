package com.tns.MoneyMoneyApp;

public abstract class SavingAcc extends BankAcc{
	final private boolean isSalaried;
	private static final float MINBAL = 1000;
	
	public boolean getIsSal() {
		return isSalaried;
	}
	
	public float getMinBal() {
		return MINBAL;
	}

	public SavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) 
	{
		super(AccNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	public void withdraw(float withdraw) {
		System.out.println("This is SavingAcc withdraw method.");
		if(getAccBal()<=MINBAL) {
			System.out.println("Account balance is already less then minimum balance");
		}
		else if(withdraw<(getAccBal()-MINBAL)) {
			System.out.println("withdraw sucessfull");
		}
		else {
			System.out.println("Withdraw Unsucessfull.Please withdraw within: "+(getAccBal()-MINBAL));
		}
	}
	
	public String toString() {
		System.out.println("This is SavingAcc toString");
		return "AccNm:"+getAccNm()+"\nAccNo: "+getAccNo()+"\nAccBal: "+getAccBal()+"\nMINBAL: "+getMinBal()+"\nIsSal: "+getIsSal();
	}
}
