package com.missionhack.arrays;

import java.util.Arrays;

public class NthLargestNumber {
// Find the nth largest element in a given array.
// Example: Input array = {10,4,5,2,11,99,57} and n=2   output: 57	
	public static void main(String[] args) {
		int[] arr = {10,4,5,2,11,99,57};
		int n = 2,len=arr.length;
		Arrays.sort(arr); // sorting the array
		System.out.println(n+" Nth largest number in given array is : "+arr[len-n]);
	}

}
