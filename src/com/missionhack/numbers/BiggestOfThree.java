package com.missionhack.numbers;

public class BiggestOfThree {

	public static void main(String[] args) {
		int a = 20, b = 12, c = 5;
		int big = 0;
		if (a >= b && a >= c) {
			big = a;
		} else if (b >= a && b >= c) {
			big = b;
		} else {
			big = c;
		}
		System.out.println("Biggest is : " + big);
	}

}
