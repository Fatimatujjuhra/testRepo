//Java program to illustrate private modifier
package com.tt.assignment2;
//Class "Task6a" is having Private access modifier
public class Task6a {
	private void add() {
		int a = 30;
		int b = 50;
		int sum = a+b;
		System.out.println(sum);
	}
	public static void main (String[]args) {
		Task6a myobj = new Task6a();
		myobj.add();
	}// end of main method
}// end of class

/*Private Modifiers in Java is used to define access to a Java data type or method, 
 * with this it is only accessible in the same class,
 * any other class of the same package won’t be able to access it.*/