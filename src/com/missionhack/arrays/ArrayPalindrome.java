package com.missionhack.arrays;

public class ArrayPalindrome {
// Given an array check weather, a given array is a palindrome or not.
	public static void main(String[] args) {
		int[] arr = { 10, 15, 25, 15, 10 };
		if (isPalindrome(arr)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	private static boolean isPalindrome(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < arr.length / 2; i++, len--) {
			if (arr[i] != arr[len - 1])
				return false;
		}
		return true;
	}

}
