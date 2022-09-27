package com.tns.wrapper;

public class UnWrapping {

	public static void main(String[] args) {
		Integer a=new Integer(20);
		int i=a.intValue();
		int j=a;
		System.out.println("a="+a+"\ni="+i+ "\nj="+j);

	}

}
