
public class StringBuiltInMethods {

	public static void main(String[] args) {
		
		String names = "john, jennie, jim, jack, joe";
		
		int length = names.length();
		System.out.println("Length of names is: "+length);
		
		int idx = names.indexOf('h');
		System.out.println("idx of h is: "+idx);
		
		idx = names.lastIndexOf('o');
		System.out.println("idx of o from the end is: "+idx);
		
		idx = names.indexOf("jim"); // it will give the index from where, jim's j starts :)
		System.out.println("jim index is: "+idx); // 14
		
		//String name = names.substring(idx); // 14 | from index 14 to end
		String name = names.substring(14, 17); // 14, 15, 16
		System.out.println(name);
		
		//char ch = names.charAt(idx);
		char ch = names.charAt(length-1);
		System.out.println("ch is: "+ch); // e
		
		char[] chArr = names.toCharArray();
		int count = 0;
		for(char chr : chArr) {
			System.out.print(chr+" ");
			if(chr == 'j') {
				count++;
			}
		}
		System.out.println();
		System.out.println("j appears "+count+" times");
		
		String[] strArr = names.split(",");
		for(String str : strArr) {
			System.out.println(str.trim()); // any extra spaces from the front and end will be removed
		}
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".com")) {
			System.out.println("A Valid Email");
		}else {
			System.out.println("Invalid Email");
		}
			
		String songName = "hello.mp3";
		if(songName.endsWith(".mp3")) { // startsWith
			System.out.println("We can play this audio file");
		}else {
			System.out.println("invalid audio file");
		}
		
		// Assignment: Explore more methods on String Class
		//             Create an array of phone numbers with String data type
		//			   eg: String[] contacts = {"+91 99999 11111", "+1 444 110 6690" //.....}'
		//			   Now take a search keyword as input from user and filter the contacts accordingly using contains or startsWith or endsWith methods
		//			   Create this solution using the methods i.e. either static or non static of your choice

	}

}
