package com.java8.cmpty;

import java.util.stream.Stream;

public class ConditionalStreamExample {
    public static void main(String[] args) {
        boolean condition = true;

        // Create a stream based on the condition
        Stream<String> stream = condition ? Stream.of("apple", "banana", "cherry") : Stream.empty();

        // Print the elements of the stream
        stream.forEach(System.out::println);
    }
}