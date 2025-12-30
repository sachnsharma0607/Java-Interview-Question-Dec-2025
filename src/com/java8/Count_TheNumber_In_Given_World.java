package com.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count_TheNumber_In_Given_World {
	public static void main(String[] args) {
		String str="language";
		System.out.println(Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s.toLowerCase(),Collectors.counting())));
 

	}
	

}
