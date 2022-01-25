
class Authenticate{
	
	void login(String email, String password) {
		System.out.println("Logging in with email and password");
	}
	
	void login(String phone, int otp) {
		System.out.println("Logging in with phone and otp");
	}
	
	void login(String googleEmail) {
		System.out.println("Logging in with Google");
	}
	
}


public class MethodOverloading {

	
	/*
	 	
	 	// Polymorphism
	 		Method Overloading -> More than 1 forms for the method
	 	
	     Rules
	 	   1. Method name is same
	 	   2. Inputs should be unique
	 	   	  2.1 number of inputs
	 	   	  2.2 type of inputs
	 	   	  2.3 sequence of inputs
	 	   3. Return type has no role to play 
	 	
	 */
	
	static void add(int a, int b) {
		int sum = a + b;
		System.out.println("sum of 2 nos is: "+sum);
	}
	
	// duplicate the method: below is error
	/*static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}*/
	
	// number of inputs
	static void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("sum of 3 nos is: "+sum);
	}
	
	// data type of inputs
	static void add(double a, double b) {
		double sum = a + b;
		System.out.println("sum of 2 double nos is: "+sum);
	}
	
	// Sequence of inputs
	static void add(int a, double b) {
		double sum = a + b;
		System.out.println("sum of 2 double nos is: "+sum);
	}
	
	static void add(double a, int b) {
		double sum = a + b;
		System.out.println("sum of 2 double nos is: "+sum);
	}
	
	public static void main(String[] args) {
		
		add(10, 20);
		add(10, 20, 30);
		add(20.22, 30.33);
		add(10, 2.2);
		add(2.2, 22);
		
		Authenticate auth = new Authenticate();
		auth.login("john@example.com", "pass123");
		auth.login("+91 99999 11111", 2234);
		auth.login("fionna@gmail.com");
	}

}
