package com.missionhack.numbers;

public class PrimeNumber {
// check the given number is prime or not 
	public static void main(String[] args) {
		int N = 4;
		System.out.println(isPrime(N) ?"Prime Number":"Not a Prime Number");
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else {
			int sqrt = (int) Math.sqrt(n);
			for (int i = 2; i <= sqrt; i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		}
	}

}
