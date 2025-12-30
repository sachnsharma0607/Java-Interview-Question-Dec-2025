package com.java8.reduce;




import java.util.Arrays;
import java.util.List;

public class DefaultMethodsorted {
public static void main(String[] args) {
	List<Integer> listarray = Arrays.asList(2,325,4,78,60);
	listarray.sort(Comparator.naturalOrder());
	System.out.println(listarray);
	System.out.println("-----reverse order==========");
	listarray.sort(Comparator.reverseOrder());
	System.out.println(listarray);

	}
}
