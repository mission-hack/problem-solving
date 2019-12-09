package com.missionhack.arrays;

import java.util.Arrays;

public class MissingNumberInArray {
// find the missing number in a given array 
	public static void main(String[] args) {
		int[] arr = { 6, 9, 7, 3, 4, 5, 2 }; // here missing number is 8
		Arrays.sort(arr);
		int prev = 0, next = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			prev = arr[i];
			next = arr[i + 1];
			if (prev + 1 != next) {
				System.out.println("Missing number is : " + (prev + 1));
				break;
			}
		}
	}

}
