package com.tt.day2;

public class BasicArithmatic2 {
	//using parameters
	void add(int a,int b) {
		int sum;
		sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		BasicArithmatic2 myobj = new BasicArithmatic2();
		myobj.add(300,200);
	}
}
