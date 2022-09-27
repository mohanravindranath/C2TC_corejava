/* Multilevel Inheritance*/
package com.tns.oops;

class State{
public void state_method() {
	System.out.println("This is Karnataka");
	}
}
class City extends State{
	public void city_method() {
		System.out.println("This is Bengaluru city");
	}
}
class District extends City{
	public void district_methhod() {
		System.out.println("This is Bengaluru Rural");
	}
}

public class Inheritance extends District  {
		public static void main(String[] args) {
		Inheritance obj= new Inheritance();
		obj.state_method();
		obj.city_method();
		obj.district_methhod();
	
	}

}