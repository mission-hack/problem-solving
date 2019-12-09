package com.missionhack.numbers;

public class NthFibnocci {

	public static void main(String[] args) {
		int nth = 9;
		System.out.println(nth + " nth fibnocci is : " + findNthFibnocciNumber(nth));
	}

	private static int findNthFibnocciNumber(int nth) {
		int fib = 1, a = 0, b = 1;
		if (nth == 0)
			return 0;
		while (nth >= 2) {
			fib = a + b;
			a = b;
			b = fib;
			nth--;
		}
		return fib;
	}

}
