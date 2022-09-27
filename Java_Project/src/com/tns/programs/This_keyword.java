package com.tns.programs;

public class This_keyword {
int A=10;
	
	void method(int a) {
	  System.out.println(A);
	  this.A=a;
	  System.out.println(a);
	}

	public static void main(String[] args) {
		This_keyword obj=new This_keyword();
		obj.method(100);

	}

}
