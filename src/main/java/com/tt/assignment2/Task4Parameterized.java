package com.tt.assignment2;

public class Task4Parameterized {
	
	int number1(int a) {
		return a;
	}
	int number2(int b) {
		return b;
	}

	public static void main(String[] args) {
		int a = 7000;
		int b = 5000;
		if (a>b) {
			System.out.println("a is bigger than b");
		} else {
			System.out.println("b is bigger than a");
		}
	}// end of main method
}// end of class 
