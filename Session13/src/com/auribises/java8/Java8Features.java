package com.auribises.java8;

@FunctionalInterface
interface Register{
	void registerUser(String email, String password);
}

class Authentication{
	
	static void login(String username, String password) {
		System.out.println("[Auth] User Logged In with username "+username);
	}
	
	void register(String username, String password) {
		System.out.println("[Auth] User Registered with username "+username);
	}
}

class DB{
	
	static void fetchRecordsFromServer() {
		System.out.println("Fetching Records....");
		System.out.println("Form the Server....");
	}
}


public class Java8Features {

	public static void main(String[] args) {
		
		Register ref1 = new Register() {
			public void registerUser(String email, String password) {
				System.out.println("[AC] User registered with email "+email+" !!");
			}
		};
		
		ref1.registerUser("john@example.com", "john123");
		
		Register ref2 = (email, password) -> System.out.println("[LE] User registered with email "+email+" !!");
		ref2.registerUser("fionna@example.com", "fionna123");
		
		Authentication auth = new Authentication();
		
		// Method Reference for non static method | Java8
		// using operator :: if the signature of method is same we can simpy copy its reference
		//					 and hence, no need to define it :)
		//Register ref3 = auth::register;
		
		// Method Reference for static method | Java8
		Register ref3 = Authentication::login;
		ref3.registerUser("dave@example.com", "dave123");
		
		// Define the run method as the definition what we have from fetchRecordsFromServer method :)
		Runnable runnable = DB::fetchRecordsFromServer;
		Thread th = new Thread(runnable);
		th.start();

	}

}
