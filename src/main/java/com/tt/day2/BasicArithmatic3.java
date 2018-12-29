package com.tt.day2;
public class BasicArithmatic3 {
	int add(int a,int b) {
		int sum;
		sum = a+b;
		return sum;
	}
	public static void main(String[] args) {
		BasicArithmatic3 myobj = new BasicArithmatic3();
		int a = 200;
		int b = 300;
		int x = myobj.add(a, b);
		System.out.println(x);
		if (x>400) {
			System.out.println("x is greater than 400");
		}else {
			System.out.println("x is smaller than 400");
		}
	}
}
