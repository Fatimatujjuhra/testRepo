package com.tt.day2;
public class BasicArithmatic {
	int a = 5;
	int b = 10;
		void add() {
			//adding methods
			int sum;
			sum = a+b;
			System.out.println(sum);
		}
		public static void main(String[] args) {
			//creating object
			BasicArithmatic myobj = new BasicArithmatic();
			myobj.add();
		}
}
