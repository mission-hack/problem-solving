package com.missionhack.arrays;

public class MaximumArrayWeight {
	/*
	 * Given an array of strings that contains a-z return which is having maximum
	 * weight if two or more strings having the same weights return any longest
	 * array among them
	 */

	/*
	 * Example: weights are a=1,b=2,c=3,..........z=26
	 * 
	 * input array = {"abc","xyz","ghij"} output: "xyz"
	 */
	public static void main(String[] args) {
		String[] arr = { "abc", "xyzx", "ghij" };
		String maxWeightString = getMaximumWeight(arr);
		System.out.println("maxWeightString : " + maxWeightString);
	}

	private static String getMaximumWeight(String[] arr) {
		int len = arr.length;
		int maxWeight[] = getWeight(arr[0]);
		String maxWeightString = "";
		for (int i = 1; i < len; i++) {
			int weight[] = getWeight(arr[i]);
			if (weight[0] > maxWeight[0] && weight[1] >= maxWeight[1]) {
				maxWeightString = arr[i];
				maxWeight = weight;
			}
		}
		return maxWeightString;
	}

	private static int[] getWeight(String str) {
		int weight = 0;
		for (int i = 0; i < str.length(); i++) {
			weight += str.charAt(i) - 48;
		}
		return new int[] { weight, str.length() };
	}

}
