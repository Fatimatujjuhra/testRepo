package com.tt.app.learnJava;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int sum=0;
		for (a=2;a<=30;a++) {
			if (a%2==0) {
				sum=sum+a;
			}
		}
		System.out.println(sum);
	}
}
