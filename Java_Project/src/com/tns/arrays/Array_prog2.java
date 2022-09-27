package com.tns.arrays;

public class Array_prog2 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=30;
		arr[1]=40;
		arr[2]=10;
		arr[3]=50;
		arr[4]=20;
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
