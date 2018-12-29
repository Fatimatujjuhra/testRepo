//Java program to illustrate protected modifier
package com.tt.assignment;
//Accessing from a different package
import com.tt.assignment2.Task6c;

class Task6cNew extends Task6c{

	public static void main(String[] args) {
	
		Task6cNew myobj = new Task6cNew();
		myobj.mul();

	}// end of main method
}// end of class
