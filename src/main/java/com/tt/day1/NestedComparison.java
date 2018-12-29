package com.tt.day1;

public class NestedComparison {
	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=800;
	
		if (a>b & b>c){
			System.out.println("a is greater then b");
		}
		else if (b>c){
			System.out.println("b is greater then c");
		}
		else{
			System.out.println("c is greatest number");
		}
}
}
