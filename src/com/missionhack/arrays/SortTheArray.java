package com.missionhack.arrays;

import java.util.Arrays;

public class SortTheArray {
	/*
	 * Sort the given Array Given an array that contains both even and odd numbers
	 * in it. Sort even numbers in increasing order and odd numbers in decending
	 * order.
	 */

	/*
	 * Ex:- input: {6,3,1,5,4,7,8,2} output:{2,7,5,3,4,1,6,8}
	 */
	public static void main(String[] args) {
		int[] arr = { 6, 3, 1, 5, 4, 7, 8, 2 };
		int len = arr.length;
		int evenCount = 0, oddCount = 0;
		for (int ele : arr) {
			if (isEven(ele)) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		int[] evenArray = new int[evenCount];
		int[] oddArray = new int[oddCount];
		int[] sortedArray = new int[len];
		int c = 0, d = 0;
		for (int ele : arr) {
			if (isEven(ele)) {
				evenArray[c++] = ele;
			} else {
				oddArray[d++] = ele;
			}
		}
		c = 0;
		Arrays.sort(evenArray);
		Arrays.sort(oddArray);
		for (int i = 0; i < len; i++) {
			if (isEven(arr[i])) {
				sortedArray[i] = evenArray[c++];
			} else {
				sortedArray[i] = oddArray[oddCount - 1];
				oddCount--;
			}
		}
		System.out.println(Arrays.toString(sortedArray));
	}

	private static boolean isEven(int n) {
		return n % 2 == 0;
	}
}
