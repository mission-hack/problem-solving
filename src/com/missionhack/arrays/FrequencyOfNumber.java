package com.missionhack.arrays;

public class FrequencyOfNumber {
// Given an array find the frequency of a number K
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 1, 2, 5, 7, 12, 5, 50 };
		int k = 5, frequency = 0;
		for (int ele : arr) {
			if (ele == k) {
				frequency++;
			}
		}
		System.out.println("Frequency of " + k + " is : " + frequency + " in a given array");
	}

}
