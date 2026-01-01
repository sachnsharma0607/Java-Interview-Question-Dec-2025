package com.java8;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Count_StreamElemeent_using_counting {
public static void main(String[] args) {
	// creating a stream of strings
    Stream<String> s = Stream.of("1", "2", "3", "4");
    System.out.println("stream "+s.toString());

    // using Collectors counting() method to
    // count the number of input elements
    long ans = s.collect(Collectors.counting());

    // displaying the required count
    System.out.println("========find the count ========");
    System.out.println(ans);
 
}
}
