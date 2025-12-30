package com.java8.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample01 {
public static void main(String[] args) {
	
	
	List<Integer> arraylist = Arrays.asList(1,2,3,4);
	Stream<Object> mapInterger = arraylist.stream().map(s->s*2);
	List<Object> collectors_toList = mapInterger.collect(Collectors.toList());
	System.out.println(collectors_toList);
}
}
