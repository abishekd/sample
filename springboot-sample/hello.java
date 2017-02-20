package com.hello.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class hello {

	public static void main(String[] args) {
		largenumbers(80);
	}
	
	public static Stream<Integer> largenumbers(int number) {
		
	List<Integer> myList = new ArrayList<>();

	for(int i=0; i<=100; i++) 
		myList.add(i);

	Stream<Integer> parallelStream = myList.parallelStream();
	
	Stream<Integer> highNums = parallelStream.filter(p -> p > number);
	
	System.out.println("Hello World! Welcome to java8");

	highNums.forEach(p -> System.out.println("High Nums parallel="+p));
	
	
	return highNums;

	}
}
