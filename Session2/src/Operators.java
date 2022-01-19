/*
 	MODEL
 		Primitive Data Type
 		Reference Data Type -> to be explored yet :) 
 	VIEW
 		Console Based i.e. Textual Command Line
 		GUI based
 	CONTROLLER
 		logic
 			1. Operators
 			2. Conditional Constructs if/else or switch case
 			3. Loops i.e. iterations
 */

public class Operators {

	public static void main(String[] args) {
		
		// Operators help to perform computation :)
		// 1. Arithmetic Operators
		//    +, -, *, /, %
		double amount = 1200.58;
		double tax = 0.18;
		
		double total = amount + (tax*amount);
		System.out.println("Total is: "+total);
		
		int number = 10;
		int buckets = 3;
		int hashCode = number % buckets;
		System.out.println("HashCode is: "+hashCode);
		
		// 2. Assignment Operators
		// =, +=, -=. *=, /=, %=
		int eWallet = 200; // = -> assignment operator copies the data
		//eWallet = eWallet + 100;
		eWallet += 100; // -> eWallet = eWallet + 100;
		System.out.println("eWallet now is: "+eWallet);
		
		eWallet %= 7;
		System.out.println("eWallet is: "+eWallet);
		
		// 3. Increment and Decrement Operators -> increment or decrement the value by 1
		int quantity = 1;
		quantity++; // postfix
		++quantity; // prefix
		
		quantity--;
		
		System.out.println("Quantity is: "+quantity); // 2
		
		//int value = quantity++; // getting the previous value :)
		int value = ++quantity; // getting the lets value :)
		System.out.println("value: "+value+" and quantity: "+quantity);
		
		// Conditional/Relational Operators
		// >, <, >=, <=, ==, !=
		
		eWallet = 300;
		int cabFare = 300;
		
		System.out.println("Can i Book Cab: "+(eWallet >= cabFare));
		
		boolean gps = true;
		System.out.println("Is gps not enabled: "+!gps);
		
		int promoCode = 12001;
		int promoCodeEnteredByUser = 12002;
		
		System.out.println("Can i get a Discount: "+(promoCode == promoCodeEnteredByUser));
		
		// Logical Operators
		// &&, !!, !
		
		System.out.println("Can i book cab and get discount: "+( (eWallet >= cabFare) && (promoCode == promoCodeEnteredByUser) ));
		System.out.println("Can i book cab and get discount: "+( (eWallet >= cabFare) || (promoCode == promoCodeEnteredByUser) ));
		
		// Bitwise Operators
		// &, |, ^
		int num1 = 10;				// 1 0 1 0
		int num2 = 8;   			// 1 0 0 0
		
		int result1 = num1 & num2;	// 1 0 0 0	-> 8
		int result2 = num1 | num2;	// 1 0 1 0	-> 10
		int result3 = num1 ^ num2;  // 0 0 1 0	-> 2
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		
		
		// Shift Operators :)
		// >>, <<, >>>
		
		int x = 8;			// 0 0 0 0  1 0 0 0
		int y = 3;			
		int z = x >> y;		// >>3
							// _ _ _ 0  0 0 0 1  => 0 0 0 0  0 0 0 1 => 1
		
		// divide 8 with 2 power 3 -> i.e. 8/8 -> 1
		System.out.println("z is: "+z);
		
		x = 11;				// 0 0 0 0  1 0 1 1
		y = 3;	
		z = x >> y;			// _ _ _ 0  0 0 0 1 => 0 0 0 0  0 0 0 1
							// 11/8 -> 1
		System.out.println("z now is: "+z);  // 1
		
		/*
		 	11
		 	0 0 0 0  1 0 1 1
		 	
		 	1 1 1 1  0 1 0 0
		 				 + 1
		 	-11			   
		 	1 1 1 1  0 1 0 1
		 	>> 3
		 	_ _ _ 1  1 1 1 0
		 	1 1 1 1  1 1 1 0
		 	
		 	0 0 0 0  0 0 0 1
		 				 + 1
		 	0 0 0 0  0 0 1 0 -> -2			 
		 */
		
		x = -13;
		y = 3;
		z = x >> y;
		System.out.println("z now is: "+z);
		
		x = 8;
		y = 3;
		z = x << y;
		// multiply 8 with 2 power 3 -> i.e. 8*8 -> 64
		// 0 0 0 0  1 0 0 0 
		// << 3
		// 0 1 0 0  0 _ _ _
		// 0 1 0 0  0 0 0 0 -> 64 :)
		
		
		System.out.println("z with left shift is: "+z);
		// Explore the left shift with negative numbers :)
		
		// Ternary Operator
		eWallet -= 200;
		String message = (eWallet >= cabFare) ? "Cab is Booked" : "Please recharge your wallet";
		System.out.println(message);
				
	}

}
