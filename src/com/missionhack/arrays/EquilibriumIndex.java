package com.missionhack.arrays;

public class EquilibriumIndex {
//Find the Equilibrium index of an array
	/*
	 * Equilibrium index of an array is an index such that the sum of elements at
	 * lower indexes is equal to the sum of elements at higher indexes. 
	 * Ex: A = {-7,1, 5, 2, -4, 3, 0} output: 3 . 
	 * 3 is an equilibrium index, because: A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
	 */
	public static void main(String[] args) {
		int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		int equilibriumIndex = getEquilibriumIndex(arr);
		System.out.println("EquilibriumIndex is " + equilibriumIndex);
	}

	private static int getEquilibriumIndex(int[] arr) {
		int sum=0,leftSum=0;
		for(int ele : arr) {
			sum += ele;
		}
		for(int i=0;i<arr.length;i++) {
			sum -= arr[i];
			if(leftSum == sum) {
				return i;
			}
			
			leftSum += arr[i]; 
		}
		return -1;
	}

}
