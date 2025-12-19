package com.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Count_TheNumber_In_Given_String {
public static void main(String[] args) {
	String str="this is the java Language and java is simple language";
	System.out.println(Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(s->s.toLowerCase(),Collectors.counting())));
}
}
