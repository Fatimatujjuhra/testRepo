package com.tt.assignment2;

public class Task2 {
	
	int a = 60000;
	int b = 30000;
	
	int sub() {
		int subtract = a-b;
		System.out.println(subtract);
		return subtract;
	}
	public static void main(String[] args) {
		Task2 myobj = new Task2();
		myobj.sub();
	}// end of main method
}// end of class
