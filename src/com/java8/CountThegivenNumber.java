package com.java8;

import java.util.stream.Stream;

public class CountThegivenNumber {
	public static void main(String[] args) {
		System.out.println(Stream.of(0, 2, 4, 6,
                8, 10, 12,6).count());
	}

}
