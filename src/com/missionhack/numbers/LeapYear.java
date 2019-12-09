package com.missionhack.numbers;

public class LeapYear {
// Given a year, check if it is leap year or not
	public static void main(String[] args) {
		int year = 2017;
		if (isLeapYear(year)) {
			System.out.println(year + " is Leap Year");
		} else {
			System.out.println(year + " is Not Leap year");
		}

	}

	public static boolean isLeapYear(int year) {
		// If a year is multiple of 400,
		// then it is a leap year
		if (year % 400 == 0)
			return true;

		// Else If a year is multiple of 100,
		// then it is not a leap year
		if (year % 100 == 0)
			return false;

		// Else If a year is multiple of 4,
		// then it is a leap year
		if (year % 4 == 0)
			return true;
		return false;
	}

}
