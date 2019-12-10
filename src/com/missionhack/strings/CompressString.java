package com.missionhack.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CompressString {

	public static void main(String[] args) {
		String str = "aabbbccdd";
		String compressedStr = getCompressedStr(str);
		System.out.println("Compressed String is : " + compressedStr);
	}

	private static String getCompressedStr(String str) {
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> set = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if (!set.contains(ch)) {
				set.add(ch);
				sb.append(ch + "" + map.get(ch));
			}
		}
		return sb.toString();
	}

}
