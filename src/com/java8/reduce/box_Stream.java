package com.java8.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class box_Stream {
	public static void main(String[] args) {
	
		int[] numbers = new int[] { 1, 2, 3 };
	Stream<Integer> box = Arrays.stream(numbers)
		      .boxed();
		      
 List<Integer> collectorstoList = box.collect(Collectors.toList());
 System.out.println(collectorstoList);

	}
	

}
