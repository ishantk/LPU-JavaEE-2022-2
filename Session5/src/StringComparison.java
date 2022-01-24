import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {
		
		// Interned Strings
		// They refer to the literals :)
		String s1 = "John";
		String s2 = "John";
		
		// String Objects
		// refers to the String objects in the heap which contains the literal
		String s3 = new String("John");
		String s4 = new String("John");
		
		//  == operator will compare only references and not data
		
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4) {
			System.out.println("s3 == s4");
		}else {
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3) {
			System.out.println("s1 == s3");
		}else {
			System.out.println("s1 != s3");
		}
		
		String password = "john@123";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Password: ");
		String userPassword = scanner.nextLine();
		
		scanner.close();
		
		//if(password == userPassword) { // false -> compares reference variables with address inside them and not the String data
		//if(password.equals(userPassword)) { // true -> equals methods compares the data
		//if(password.equalsIgnoreCase(userPassword)) { // -> true | ignore case sensitivity
		
		//if(password.compareTo(userPassword) == 0) { // compareTo returns int -> if 0 then Strings are equal
		if(password.compareToIgnoreCase(userPassword) == 0) {
			System.out.println("Welcome to Home");
		}else {
			System.out.println("Password MisMatched");
		}
		
		/*if("john@123" == userPassword) {
			// :(
		}else {
			// :)
		}*/
		
		// Assignment: Explore contentEquals() method in String
		
	}

}
