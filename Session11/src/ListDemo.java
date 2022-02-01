import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

/*
 	
 	Collections FW:
 		java.util package gives various interfaces and classes which forms the data structures
 		
 		List (interface)
 			ArrayList (classes)
 			LinkedList
 			Vector
 			Stack
 		Set (interface)
 			HashSet
 			LinkedHashSet
 			TreeSet
 		Queue (interface)
 			PriorityQueue
 		Map (interface)
 			HashMap
 			LinkedHashMap
 			TreeMap
 			Hashtable
 			
 		interface List{
 			
 		}
 		
 		class ArrayList implements List{
 		
 		}
 		
 		List list = new ArrayList(); :)
 */

class Message{
	
	String text;
	String toPhoneNumber;

	Message(){
		
	}

	Message(String text, String toPhoneNumber) {
		this.text = text;
		this.toPhoneNumber = toPhoneNumber;
	}
	
	void show() {
		System.out.println("Message details: "+text+" "+toPhoneNumber);
	}
}


public class ListDemo {

	public static void main(String[] args) {
	
		Message m1 = new Message("Hello, John", "+91 99999 11111");
		Message m2 = new Message("Hey Fionna", "+91 99999 22222");
		
		// 1. Arrays are homogeneous
		// 2. They are fixed in Size
		// int[] array = new int[10];
		// String[] names = new String[10];
		
		// List which is dynamic i.e. it can grow and shrink in size
		
		// Hetrogeneous List i.e. it can store any object
		ArrayList list1 = new ArrayList();
		
		// Homogeneous List i.e. it can store only Strings
		ArrayList<String> list2 = new ArrayList<String>(); // Direct Object Construction
		//List<String> list = new ArrayList<String>(); // Polymorphic Statement

		ArrayList<Message> list3 = new ArrayList<Message>();
		
		//ArrayList<int> list4 = new ArrayList<int>(); // error: cannot work on primitives
		//ArrayList<Integer> list4 = new ArrayList<Integer>(); // ok with Wrapper Classes
		
		// operations on list
		// 1. Add Data in List
		list1.add("Jennie");			// 0
		list1.add(10); // -> AutoBoxed to Integer
		list1.add('A');
		list1.add("Harry");
		list1.add(2.2);
		list1.add(m1);					// n-1
		//list1.add(6, "Jennie"); // we can add on indexes as well. but do not manually manage indexes as it can be erroneous
		
		
		list2.add("Jennie");
		list2.add("John");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("Joe");
		//list2.add(10); // err
		//list2.add(m1); // err
		
		list3.add(m1);
		list3.add(m2);
		//list3.add("Jennie"); // err
		
		// 2. Print the List
		System.out.println("list1 is: ");
		System.out.println(list1);
		System.out.println();
		
		System.out.println("list2 is: ");
		System.out.println(list2);
		System.out.println();
		
		System.out.println("list3 is: ");
		System.out.println(list3);
		System.out.println();
		
		// 3. Get the Single Element from the List
		Object o = list1.get(3); 
		String s = list2.get(1);
		Message m = list3.get(0);
		
		System.out.println("o: "+o);
		System.out.println("s: "+s);
		System.out.println("m: "+m);
		m.show();
		
		System.out.println();
		
		// 4. Update Data in List
		System.out.println("list2 Before: "+list2);
		list2.set(2, "Mike");
		System.out.println("list2 After: "+list2);
		
		// 5. Delete element from list
		list2.remove(2);
		//list2.clear(); // removes all the elements from the list
		System.out.println("list2 After Remove is: "+list2);
		
		// 6. Size of the list
		System.out.println("list1 size: "+list1.size());
		System.out.println("list2 size: "+list2.size());
		System.out.println("list3 size: "+list3.size());
		
		// 7. Contains
		if(list2.contains("John")) {
			System.out.println("John is in the list");
			int idx = list2.indexOf("John");
			System.out.println("index of John is: "+idx);
		}
		
		// 8. Add All from One List to Another
		//ArrayList<String> names = new ArrayList<String>(); // data is saved using dynamic array technique
		//LinkedList<String> names = new LinkedList<String>(); // data is saved using circular doubly linked list
		
		// Vector is a Thread-Safe implementation of List
		// Whenever we will be using multi threading technique, we must use Vector
		// It is Synchronized :)
		Vector<String> names = new Vector<String>();
		names.add("Leo");
		names.add("Harry");
		names.add("Kim");
		
		names.addAll(list2);
		System.out.println("names is: ");
		System.out.println(names);
		
		// 9. Sub List
		List<String> subList = names.subList(2, 6);
		System.out.println("subList is: "+subList); // 2 to 5 :)
		System.out.println();
		// Explore more methods :)
		
		// 10.1 Iterating in the List 
		System.out.println("Iterating - The Basic For Loop");
		for(int i=0;i<names.size();i++) {
			String name = names.get(i);
			System.out.println(name);
		}
		
		System.out.println();
		
		// 10.2 Iterating in the List 
		System.out.println("Iterating - The Enhanced For Loop");
		for(String name:  names) {
			System.out.println(name);
		}
		
		System.out.println();
		
		for(Object element : list1) {
			System.out.println(element);
		}
		
		System.out.println();
		
		for(Message element : list3) {
			element.show();
		}
		
		System.out.println();
		
		// 10.3 Iterating in the List 
		System.out.println("Iterating - With Iterator API");
		Iterator<String> itr = names.iterator();
		/*System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());*/
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
			
			if(name.equals("John")) {
				itr.remove(); // remove data from arraylist
			}
		}
		
		System.out.println("names is: "+names);
		
		System.out.println();
		
		// 10.4 Iterating in the List 
		System.out.println("Iterating - With ListIterator API");
		ListIterator<String> listItr = names.listIterator();
		while(listItr.hasNext()) {
			String name = listItr.next();
			System.out.println(name);
		}
		System.out.println("~~~~~~");
		while(listItr.hasPrevious()) {
			String name = listItr.previous();
			System.out.println(name);
		}
		
		System.out.println();
		// 10.5 Iterating in the List 
		System.out.println("Iterating - With Enumeration API");
		Enumeration<String> enm = Collections.enumeration(names);
		while(enm.hasMoreElements()) {
			String name = enm.nextElement();
			System.out.println(name);
			//enm.remove(); // not supported
		}
		
		System.out.println();
		// 10.6 Iterating in the List using Lambda Expressions
		System.out.println("Iterating - Using forEach Lambda Expression");
		names.forEach((element) -> System.out.println(element));
		
		// we can use stack as list itself
		// but here we have push and pop terminology i.e. supporting LIFO principle
		Stack<String> stack = new Stack<String>();
		stack.push("John");
		stack.push("Jennie");
		stack.push("Anna");
		stack.push("Kia");
		stack.push("Leo");
		
		stack.pop(); // removes the last inserted element :)
		//stack.remove(1);
		
		System.out.println("Stack is: "+stack);
		
		
	}

}
