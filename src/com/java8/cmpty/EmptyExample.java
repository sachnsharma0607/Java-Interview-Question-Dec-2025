package com.java8.cmpty;

import java.util.stream.Stream;

public class EmptyExample {
    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.empty();

        // Attempt to print the elements of the empty stream
        emptyStream.forEach(System.out::println);
    }
}