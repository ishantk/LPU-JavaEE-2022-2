
public class MutableStrings {

	public static void main(String[] args) {
		
		String name = new String("John");
		String fullName = name + " Watson"; //name.concat(" Watson");
		
		System.out.println("name is "+name); // John
		System.out.println("fullName is: "+fullName); // John Watson
		

		// Mutable Version of String in Java
		// If we wish to perform some manipulation on Strings, -> USE StringBuffer :)
		// StringBuffer is thread-safe
		StringBuffer buffer = new StringBuffer("John");
		buffer.append(" Watson");
		System.out.println("buffer is: "+buffer);
		
		// StringBuffer cannot be created in an interned way
		// It will always be created as an Object
		//StringBuffer b1 = "Hello"; // error
		
		// Mutable Version of String in Java 
		// A bit faster as compared to StringBuffer
		// StringBuilder is not thread-safe
		StringBuilder builder = new StringBuilder("Fionna");
		builder.append(" Flynn");
		System.out.println("builder is: "+builder);
		
		// Assignment: Explore the built in methods which are very much similar to Strings for StringBuffer and StringBuilder
		//			   Explore the way how capacity would work for StringBuilder ?
		
	}

}
