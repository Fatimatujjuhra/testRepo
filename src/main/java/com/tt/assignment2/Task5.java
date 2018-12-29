package com.tt.assignment2;

public class Task5 {

	int add(int a,int b) {
		int sum;
		sum = a+b;
		System.out.println(sum);
		return sum;
	}
	int add(int a,int b,int c) {
		int sum;
		sum = a+b+c;
		System.out.println(sum);
		return sum;	
	}
	public static void main(String[] args) {
		Task5 myobj = new Task5();
		myobj.add(500, 600);
		myobj.add(500, 300, 100);
	}// end of main method
}// end of class
