package com.tns.MoneyMoneyApp;
public abstract class BankAcc 
{
	final private int accNo;
	private String accNm;
	final private float accBal;
	
	public BankAcc(int AccNo, String accNm, float accBal){
	accNo=AccNo;
	this.accNm=accNm;
	this.accBal=accBal;
	}
	public float getAccBal() {
		return accBal;	
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNm(String accNm) {
		this.accNm=accNm;
	}
	
	public String getAccNm() {
		return accNm;
	}
	public abstract void withdraw(float withdraw);
	public abstract String toString();
	public abstract float deposite(float deposite) ;

}

	
