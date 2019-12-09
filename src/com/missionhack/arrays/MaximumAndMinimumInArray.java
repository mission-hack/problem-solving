package com.missionhack.arrays;

public class MaximumAndMinimumInArray {
// Find the maximum and minimum element in a given array. 
	public static void main(String[] args) {
		int[] arr = { 99, 0, 101, -2, -22, 47, 57, 35, 10 };
		int max = arr[0], min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			else if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Maximum : " + max);
		System.out.println("Minimum : " + min);
	}

}
