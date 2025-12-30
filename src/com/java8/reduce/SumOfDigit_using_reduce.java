package com.java8.reduce;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class SumOfDigit_using_reduce {
public static void main(String[] args) {
	Optional<Integer> sumofdigit = Stream.of(2,3,4,5).reduce(Integer::sum);
	sumofdigit.ifPresent(System.out::print);
	System.out.println("");
	sumofdigit.stream().forEach(System.out::print);

	
}

}
