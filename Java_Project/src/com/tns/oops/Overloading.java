package com.tns.oops;

public class Overloading {
	Overloading(){
		System.out.println("Finding Volume");
	}
	
	int cube(int a) {
		return a*a*a;
	}
	
	int cuboid(int l, int h, int b) {
		return l*h*b;
	}
	
	double sphere(double r) {
		return (4/3)*(3.14*r*r*r);
	}

	public static void main(String[] args) {
		Overloading obj=new Overloading();
		int retcube=obj.cube(3);
		System.out.println("Volume of Cube is: "+obj.cube(3));
		System.out.println("Volume of Cuboid is: "+obj.cuboid(3, 2, 5));
		System.out.println("Volume of Sphere is: "+obj.sphere(2));

	}

}
