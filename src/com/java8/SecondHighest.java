package com.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {

   public static void main(String[] args) {
       
       List<Integer> numbers = Arrays.asList(2,4, 6, 3, 6, 5);
       
       List<Integer> sortedUniqueNumbers = numbers.stream()
              .distinct()  // remove duplicates
              .sorted()    // sort
              .collect(Collectors.toList()); // convert stream to list
       
       System.out.println("sec_highest=" +
           sortedUniqueNumbers.get(sortedUniqueNumbers.size()-2));    
   }
}
