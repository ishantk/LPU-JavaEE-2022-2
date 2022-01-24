
public class ImmutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE. Not Just in Java but in all programming languages.
		
		 //int i = 10; // 10 -> is literal and is constant !!
		
		String quote = "be exceptional"; // similarly, we cannot modify "be exceptional" literal
		// if we wish to manipulate a string, we get a new string in the memory
		String upperCaseQuote = quote.toUpperCase();
		System.out.println("quote is: "+quote);
		System.out.println("upperCaseQuote is: "+upperCaseQuote);
		
		String names = "john, jennie, jim, jack, joe";
		String replacedNames = names.replace('j', 'k');
		System.out.println("names are: "+names);
		System.out.println("replacedNames are: "+replacedNames);
		
		// All in All, if we manipulate a String, we get a new String in memory :)
		
		// This is a no good statement :(
		quote = quote.toUpperCase(); // Strings are not mutable by this expression :(
		

	}

}
