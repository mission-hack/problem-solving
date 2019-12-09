package com.missionhack.numbers;

public class SumOfSum {

	public static void main(String[] args) {
		int N = 345;
		int previous = 0;
		String num = String.valueOf(N); // Converting number to string
		char[] arr = num.toCharArray(); // converting string to char array
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i] - 48;
			ele += previous;
			sum += findSum(ele);
			previous=ele;
		}
		System.out.println("Required sum is : "+sum);
	}

	private static int findSum(int ele) {
		int sum=0;
		while(ele>0) {
			sum += ele%10;
			ele /= 10;
		}
		return sum;
	}

}
