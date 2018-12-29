package com.tt.assignment2;

class Task7New extends Task7{
	void mul() {
		int e = 60;
		int f = 30;
		int mul = e*f;
		System.out.println(mul);
	}
	void subnew() {
		int g = 500;
		int h = 200;
		int subnew = g-h;
		System.out.println(subnew);
	}
	public static void main(String[] args) {
		Task7New myobj = new Task7New();
		myobj.add();
		myobj.sub();
		myobj.mul();
		myobj.subnew();
	}// end of main method
}// end of child class