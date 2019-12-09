package com.missionhack.numbers;

public class PrimeSum {
// Given a number find the prime sum 
// Explanation: ex: N = 2345, In the given digits 2,3 and 5 are prime digits so find the sum all prime numbers.	
	public static void main(String[] args) {
		int N = 2345;
		int sum = 0, rem = 0;
		while (N > 0) {
			rem = N % 10;
			if (PrimeNumber.isPrime(rem)) {
				sum += rem;
			}
			N /= 10;
		}
		System.out.println("Sum of all prime numbers in a given number is : " + sum);
	}

}
