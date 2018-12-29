//Java program to illustrate protected modifier
package com.tt.assignment2;
//Class "Task6c" is having Protected access modifier
public class Task6c {
	protected void mul() {
		int a = 900;
		int b = 300;
		int mul = a*b;
		System.out.println(mul);
	}// end of multiplication method
}// end of class

/*With this Java keyword, the methods or data types can access 
 * within the same package or subclass of a different package.*/