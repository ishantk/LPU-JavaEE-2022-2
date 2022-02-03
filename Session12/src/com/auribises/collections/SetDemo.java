package com.auribises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
	
		
		//ArrayList<String> emailList = new ArrayList<String>();
		//emailList.add("john@example.com");
		
		List<String> emailList = Arrays.asList("john@example.com", "jennie@example.com", 
				"mike@example.com", "fionna@example.com", "dave@example.com", "john@example.com");
		
		System.out.println("email List is: ");
		System.out.println(emailList);
		
		// ArrayList can duplicate entries

		//Set<String> emailSet = new HashSet<String>();   // Polymorphic Statement
		//HashSet<String> emailSet = new HashSet<String>(); // Direct Object Construction
		
		// Uniqueness and Order of adding the data
		// A bit less optimized as compared to HashSet, as order of data is to be maintained
		//LinkedHashSet<String> emailSet = new LinkedHashSet<String>();
		
		// Uniqueness and Sorting of the data
		TreeSet<String> emailSet = new TreeSet<String>();
		emailSet.add("john@example.com");
		emailSet.add("jennie@example.com");
		emailSet.add("mike@example.com");
		emailSet.add("fionna@example.com");
		emailSet.add("dave@example.com");
		emailSet.add("john@example.com");
		emailSet.add("mike@example.com");
		
		System.out.println("email Set is: ");
		System.out.println(emailSet);
		
		// Output Of HashSet is unordered i.e. due to hashing
		// Hence, in HashSet data is not stored on indexes :)
		// With which we will not be able to get the data as single element from HashSet
		
		// emailSet.get(?): get method not available
		
		//emailSet.remove("mike@example.com");
		//emailSet.clear();
		System.out.println(emailSet.size());
		if(emailSet.contains("dave@example.com")) {
			System.out.println("Dave is in the Set");
		}
		
		
		// Iterate using enhanced for loop
		System.out.println();
		System.out.println("1. Iterate using enhanced for loop");
		for(String email : emailSet) {
			System.out.println(email);
		}
		
		System.out.println();
		System.out.println("2. Iterate using Iterator");
		Iterator<String> itr = emailSet.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);		
		}
		
		// Assignment: Explore listIterator and enumeration on HashSet and check if they work or not :)
	}

}
