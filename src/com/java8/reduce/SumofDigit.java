package com.java8.reduce;

import java.util.stream.Stream;

public class SumofDigit {
public static void main(String[] args) {
	
	Stream<Integer> streamInteger = Stream.of(1,2,3);
	   Integer sumofAllInteger = streamInteger.reduce(11,(a,b)->a+b);
	System.out.println(sumofAllInteger);
	
}
}
