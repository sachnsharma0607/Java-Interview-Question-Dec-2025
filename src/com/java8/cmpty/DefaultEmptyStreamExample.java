package com.java8.cmpty;

import java.util.stream.Stream;

public class DefaultEmptyStreamExample {
    public static void main(String[] args) {
        Stream<String> stream = getStream(false);

        // Process the stream
        stream.forEach(System.out::println);
    }

    public static Stream<String> getStream(boolean hasData) {
        if (hasData) {
            return Stream.of("data1", "data2", "data3");
        } else {
            return Stream.empty();
        }
    }
}
