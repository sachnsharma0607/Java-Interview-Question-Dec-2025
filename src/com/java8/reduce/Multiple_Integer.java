package com.java8.reduce;

import java.util.Optional;
import java.util.stream.Stream;

public class Multiple_Integer {
public static void main(String[] args) {
	
	Stream<Integer> streamInteger = Stream.of(1,2,3);
	  Integer Integ = streamInteger.reduce(1,(a,b)->a*b);
	System.out.println(Integ);

}
}
