
public class Strings {

	public static void main(String[] args) {
		
		// Interned String
		String name1 = "John Watson"; // this remains in the memory till program is not finished
		
		// Object String
		String name2 = new String("Fionna Flynn"); // this can be deleted form the memory by garbage collector
		
		// name1 and name2 are known as reference variables
		
		// we create interned strings, which we know will be required throughout the application
		// eg: String appName = "WhatsApp";

		
		// When we print Strings, reference variables rather than showing the hashcodes
		// they show the data directly
		System.out.println("name1 is: "+name1);
		System.out.println("name2 is: "+name2);
		
		// Let us print the name1 and name2 with execution of a method called toString()
		System.out.println("name1.toString() is: "+name1.toString());
		System.out.println("name2.toString() is: "+name2.toString());
		
		// i.e. when we print reference variable of String, 
		// toString will be executed and it shoes the data rather than hashcodes
		
		// Lastly, toString gets executed automatically whenever we print reference variable of String :)
		
		System.gc();
	}

}
