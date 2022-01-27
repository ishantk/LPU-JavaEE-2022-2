abstract class CA{
	
	CA(){
		
	}
	
	abstract void show();
	
	void hello() {
		System.out.println("This is hello");
	}
}

// For Abstraction :)

interface Inf{
	
	// Interfaces cannot have constructors
	
	/*Inf(){
		
	}*/
	
	// Interfaces has nothing to do with objects :)
	
	void show(); // by default -> public abstract void show();
	
	// raw method definition i.e. non static methods not allowed :)
	/*void hello() {
		System.out.println("This is hell");
	}*/
}

class CB implements Inf{
	
	public void show() {
		System.out.println("This is show of Inf");
	}
	
	
	void bye() {
		System.out.println("This is done :)");
	}
}


public class WhatIsInterface {

	public static void main(String[] args) {
		
		// Polymorphic Statement
		// Reference Variable of Interface can refere to the object of the class which implements it
		Inf ref = new CB();
		ref.show();
		
		//ref.bye(); // error
		
	}

}
