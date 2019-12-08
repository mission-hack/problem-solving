package com.missionhack.numbers;

public class NumberPalindrome {
	// Check weather the given number(N) is a palindrome or not
	public static void main(String[] args) {
		int N = 1221; // INPUT
		int rev = 0, temp = N, rem = 0;
		while (temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}

		if (N == rev) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
	}
}
