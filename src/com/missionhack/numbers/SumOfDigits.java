package com.missionhack.numbers;

public class SumOfDigits {
	
	// find the sum of digits in a given number,N
	public static void main(String[] args) {
		int N = 1234;
		int sum = 0, rem = 0;
		while (N > 0) {
			rem = N % 10;
			sum += rem;
			N /= 10;
		}
		System.out.println("Sum is : " + sum);
	}

}
