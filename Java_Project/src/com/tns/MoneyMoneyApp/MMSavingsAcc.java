package com.tns.MoneyMoneyApp;

public class MMSavingsAcc extends SavingAcc {

	public MMSavingsAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		super(AccNo, accNm, accBal, isSalaried);

	}
	@Override
	public float deposite(float deposite) {
		return deposite;
	}
	
	@Override
	public void withdraw(float withdraw) {
		System.out.println("This is MMsavingAcc withdraw method.");
		if(getAccBal()<=getMinBal()) {
			System.out.println("Account balance is already less then minimum balance");
		}
		else if(withdraw<(getAccBal()- getMinBal())) {
			System.out.println("withdraw sucessfull \nWithdraw Amount: "+withdraw );
		}
		else {
			System.out.println("Withdraw Unsucessfull.\nPlease withdraw within"+(getAccBal()-getMinBal()));
		}
	}
	
	
	@Override
	public String toString() {
		System.out.println("This is toString method in MMSavingsAcc");
		System.out.println("AccNm:"+getAccNm()+"\nAccNo: "+getAccNo()+"\nDepositeAmt: "+deposite(10000)+"\nAccBal: "+(getAccBal()+ deposite(10000))+"\nMINBAL: "+getMinBal()+"\nIsSal: "+getIsSal());
		return "AccNm:"+getAccNm()+"\nAccNo: "+getAccNo()+"\nDepositeAmt: "+deposite(10000)+"\nAccBal: "+(getAccBal()+ deposite(10000))+"\nMINBAL: "+getMinBal()+"\nIsSal: "+getIsSal();
	}

}
