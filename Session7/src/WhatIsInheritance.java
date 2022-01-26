// What is Inheritance
// Parent Child Relationship


class Parent{
	
	String fname;
	String lname;
	//private int wealth;
	int wealth;
	
	Parent(){
		System.out.println("[Parent] Object Constructed");
		fname = "John";
		lname = "Watson";
		wealth = 100000;	
	}
	
	void show() {
		System.out.println("[Parent] Details: "+fname+" "+lname+" "+wealth);
	}
}

// Create Relationship of Parent and Child between 2 classes
// using extends keyword in Java
class Child extends Parent{
	
	String fname;
	int wealth;
	String companyName;
	
	Child(){
		System.out.println("[Child] Object Constructed");
		fname = "Fionna";
		wealth = 200000;
		companyName = "ABC Ltd";
	}
	
	// ReDefining the same method, which is in the Parent, inside the child clas
	// OVERRIDING
	void show() {
		super.show(); // super as a reference variable available in Child, to access the Parent's Property
		System.out.println("[Child] Details: "+fname+" "+lname+" "+wealth+" "+companyName);
	}
}

// Inheritance Rules:
// Rule#1 : Before the object of Child, Object of Parent is constructed
// Rule#2 : Child, can access anything in Parent, if child does not have it. If child has the same property, it will access of its own
// Rule#3 : Child cannot access anything marked as private in Parent

public class WhatIsInheritance {

	public static void main(String[] args) {
		
		//Parent pRef = new Parent();
		//pRef.show();
		
		Child cRef = new Child();
		
		System.out.println();
		System.out.println("cRef is: "+cRef);
		
		// Previously, child here has no attribute wealth, it will update in the Parent Object
		// Now, as child also has the wealth attribute, it will subtract from its own attribute
		cRef.wealth -= 5000; 
		
		System.out.println();
		cRef.show();

	}

}
