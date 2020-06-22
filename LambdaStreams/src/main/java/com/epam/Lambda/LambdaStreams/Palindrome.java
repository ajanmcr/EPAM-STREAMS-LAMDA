package com.epam.Lambda.LambdaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class Palindrome {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(new String("add"));
		list.add(new String("aaa"));
		list.add(new String("aba"));
		List<String> result = new ArrayList<String>();
		for(String s : list) {
			if(isPalindrome(s)) {
				result.add(s);
			}
		}
		System.out.println(result);
	
}
	public static boolean isPalindrome(String  s) {
		String temp = s.replaceAll("\\s+", "").toLowerCase();
		return IntStream.range(0,  temp.length() / 2)
				.noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	}
}
