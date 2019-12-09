package com.missionhack.numbers;

public class IncrementByOne {
// Given a number increase each digit by 1 if the digit is 9 make it 0
	public static void main(String[] args) {
		int N = 1798;
		int res = getIncremented(N);
		System.out.println(res);
	}

	private static int getIncremented(int N) {
		int res = 0, rem = 0;
		while (N > 0) {
			rem = N % 10;
			if (rem == 9) {
				rem = 0;
			} else {
				rem++;
			}
			res = res * 10 + rem;
			N /= 10;
		}
		return getReversed(res);
	}

	private static int getReversed(int n) {
		int rev = 0, rem = 0;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		return rev;
	}

}
