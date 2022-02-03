package com.auribises.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		// Polymorphic Statement
		//Map<String, Integer> map = new HashMap<String, Integer>();

		// Direct Object Construction
		//HashMap<String, Integer> dishMap = new HashMap<String, Integer>();
		
		// maintain the order
		//LinkedHashMap<String, Integer> dishMap = new LinkedHashMap<String, Integer>();
		
		// Sort the Entries as per the keys
		//TreeMap<String, Integer> dishMap = new TreeMap<String, Integer>();
		
		// Thread Safe i.e. Synchronized
		Hashtable<String, Integer> dishMap = new Hashtable<String, Integer>();
		
		// HashMap works as Key Value pair and uses hashing and hence, output will be unordered
		dishMap.put("noodles", 200);
		dishMap.put("burger", 120);
		dishMap.put("dal", 250);
		dishMap.put("paneer", 350);
		dishMap.put("roti", 20);
		
		// HashMap will have unique keys but values can be duplicated
		dishMap.put("burger", 150); // this is an update operation, as key burger already exists
		dishMap.put("samosa", 20);
		
		System.out.println("dishMap is: ");
		System.out.println(dishMap);
		
		int price = dishMap.get("burger");
		System.out.println("Price of Burger is: "+price);
		
		// we can have 1 null key
		//dishMap.put(null, 10);
		//dishMap.put("ice cream", null);
		
		// TreeMap : cannot have null keys
		// Hashtable: cannot have null keys or null values
		
		dishMap.remove("samosa");
		System.out.println(dishMap);
		
		if(dishMap.containsKey("noodles")) {
			System.out.println("Noodles is in the HashMap");
		}
		
		if(dishMap.containsValue(350)) {
			System.out.println("HashMap contains value 350");
		}
		
		Set<String> keys = dishMap.keySet();
		System.out.println("keys in dishMap: ");
		System.out.println(keys);
		
		System.out.println();
		System.out.println("1. Iterarting in Keys to Get Values");
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Integer value = dishMap.get(key);
			System.out.println(key+"\t"+value);
		}
		
		System.out.println();
		System.out.println("1. Iterarting with entrySet");
		Set<Entry<String, Integer>> entrySet = dishMap.entrySet();
		
		Iterator<Entry<String, Integer>> itr1 = entrySet.iterator();
		while(itr1.hasNext()) {
			Entry<String, Integer> entry = itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		// Assignment: 1. Explore of enhanced for loop and enumeration will work on HashMap
		
	}

}
