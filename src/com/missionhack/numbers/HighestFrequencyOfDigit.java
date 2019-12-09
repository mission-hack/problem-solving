package com.missionhack.numbers;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HighestFrequencyOfDigit {
// Find the highest frequency of digit in a given number
// Explanation: In 1998, most repeated digit is 9
	public static void main(String[] args) {
		int N = 1998;
		Map<Integer, Integer> map = new HashMap<>();
		int rem = 0;
		while (N > 0) {
			rem = N % 10;
			if (map.containsKey(rem)) {
				int count = map.get(rem);
				count++;
				map.put(rem, count);
			} else {
				map.put(rem, 1);
			}
			N /= 10;
		}

		Set<Integer> keys = map.keySet();
		int max = 0, highestFrequency = 0;
		int key = 0;
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			key = itr.next();
			int count = map.get(key);
			if (count > max) {
				max = count;
				highestFrequency = key;
			}
		}

		System.out.println("Highest Frequency Digit is : " + highestFrequency);
	}

}
