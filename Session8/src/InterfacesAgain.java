
interface Inf1{
	
	int number = 10; // => by default => public static final int number = 10;

	// public static final
	String appName = "Customer Management System";
	
	default void show() {
		System.out.println("This is show of Inf1");
	}
	
	static void hello() {
		System.out.println("This is hello from Inf1");
	}
	
	void bye();
	
}

class AB implements Inf1{

	public void bye() {
		System.out.println("This is Bye from AB");
	}
	
	void thanks() {
		System.out.println("Thank You All");
	}
}


public class InterfacesAgain {

	public static void main(String[] args) {
		
		Inf1 ref = new AB();
		ref.show();
		ref.bye();
		
		//ref.hello(); // static methods not accessible with reference
		//ref.thanks(); // methods inside the object not accessible by interface reference
		
		System.out.println("number is: "+ref.number); // allowed :)
		System.out.println("number is: "+Inf1.number); // ideal way as number is by default static -> must be accessed with interface name
		
		// static methods are accessible only with interface name :)
		Inf1.hello();
		
		// Down - Casting
		AB aRef = (AB)ref; // copied the hash code from reference variable of the interface referring to AB object in AB ref
		aRef.thanks();

	}

}

// Assignment: Code what we coded today :)
