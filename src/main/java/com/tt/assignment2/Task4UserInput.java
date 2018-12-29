package com.tt.assignment2;

import java.util.Scanner;

public class Task4UserInput {
	
	public static void main(String[] args) {
		compare();
	}// end of main method
	
	@SuppressWarnings("resource")
	public static void compare() {
		Scanner sc = new Scanner(System.in);
		int a,b;
        System.out.print("Enter 1st number: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        b = sc.nextInt();
        if (a>b) {
        	System.out.println("a is greater than b");
        } else {
        	System.out.println("b is greater than a");
        }
	}// end of compare method
}// end of class