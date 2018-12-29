package com.tt.day2;
public class BasicArithmatic4 {
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
	double add(double a,double b,double c) {
		double sum;
		sum = a+b+c;
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		BasicArithmatic4 myobj = new BasicArithmatic4();
		myobj.add(300,200);
		myobj.add(300,200,700);
		myobj.add(300.50,200.60,600.47);
	}
}
