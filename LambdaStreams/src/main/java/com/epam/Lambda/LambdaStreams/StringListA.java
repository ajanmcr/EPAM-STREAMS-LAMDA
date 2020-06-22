package com.epam.Lambda.LambdaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringListA {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aad");
		list.add("bbb");
		list.add("aaa");
		list.add("aa");
		List<String> resultList = getFilterString(list);
		System.out.println(resultList);
	}
	public static List<String> getFilterString(List<String> list) {
		return list.stream()
				  .filter(s -> s.startsWith("a"))
				  .filter(s -> s.length() == 3)
				  .collect(Collectors.toList());
	}

}
