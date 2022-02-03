package com.auribises.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		
		/*List<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		data.add(50);*/
		
		List<Integer> data = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println("data is: "+data);
		
		// Read data into Stream i.e. Creating a Stream
		Stream<Integer> stream = data.stream();
		
		// Iterating in Stream
		// Perform any operation on Stream, it will release the stream afterwards
		//stream.forEach((element)->System.out.println(element));

		// Re Using the Same Stream to perform some operation is error at runtime
		//stream.forEach((element)->System.out.println(element));
		
		// Filtered the Stream
		//Stream<Integer> filteredData = stream.filter((element)->element>=25);
		//filteredData.forEach((element)->System.out.println(element));
		
		//Stream<Integer> mappedData = stream.map((element)->element+2);
		//mappedData.forEach((element)->System.out.println(element));
		
		System.out.println(stream.reduce((a, b)->a+b).get());
		
		// Explore some more methods on Streams :)
		

	}

}
