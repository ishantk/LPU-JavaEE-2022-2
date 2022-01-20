import java.util.Scanner;

public class ConditionalContructs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble();
		
		System.out.println("Enter a Promo Code: ");
		int promoCode = scanner.nextInt();
		
		scanner.close(); // release the stream and make the memory clear :)
		
		System.out.println("You Entered: "+amount+" | "+promoCode);
		
		// Promo Codes
		final int JUMBO = 101;    // Flat 50% Off for orders value worth equal or more than 200
		//JUMBO = 1101; // error
		final int ZOMHELLO = 201; // Flat 40% Off upto 80 order value worth equal or more than 159
		
		// simple -> if/else
		/*if(amount >= 159) {
			System.out.println("You can apply the promo code");
		}else {
			System.out.println("You cannot apply the promo code");
		}*/
		
		double discount = 0;
		
		// simple -> if/else
		/*if(promoCode == JUMBO && amount >= 200) {
			discount = 0.5 * amount;
			System.out.println("Discount is: \u20b9"+discount);
			System.out.println("JUMBO Applied Successfully");
		}else {
			System.out.println("Invalid Promo Code or Lesser Amount");
		}*/
		
		// Nested if/else
		/*if(promoCode == JUMBO) {
			
			if(amount >= 200) {
				discount = 0.5 * amount;
				System.out.println("Discount is: \u20b9"+discount);
				System.out.println("JUMBO Applied Successfully");
			}else {
				System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more");
			}
			
		
		}else {
			System.out.println("Invalid Promo Code");
		}*/
		
		
		// Ladder if/else
		/*if(promoCode == JUMBO) {
			
			if(amount >= 200) {
				discount = 0.5 * amount;
				System.out.println("Discount is: \u20b9"+discount);
				System.out.println("JUMBO Applied Successfully");
			}else {
				System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more");
			}
			
		
		}else if(promoCode == ZOMHELLO) {
			
			if(amount >= 159) {
				discount = 0.4 * amount;
				
				if(discount > 80) {
					discount = 80; // upto condition :)
				}
				
				System.out.println("Discount is: \u20b9"+discount);
				System.out.println("ZOMHELLO Applied Successfully");
			}else {
				System.out.println("Amount is Lesser. Please add items worth "+(159-amount)+" more");
			}
			
			
		}else {
			System.out.println("Invalid Promo Code");
		}*/
		
		
		switch(promoCode) {
		
			case JUMBO:
				
				if(amount >= 200) {
					discount = 0.5 * amount;
					System.out.println("Discount is: \u20b9"+discount);
					System.out.println("JUMBO Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more");
				}
				
				break;
				
			case ZOMHELLO:
				
				if(amount >= 159) {
					discount = 0.4 * amount;
					
					if(discount > 80) {
						discount = 80; // upto condition :)
					}
					
					System.out.println("Discount is: \u20b9"+discount);
					System.out.println("ZOMHELLO Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. Please add items worth "+(159-amount)+" more");
				}
				
				break;
				
			default:
				System.out.println("Invalid Promo Code");
		
		}
		
		
		
		
		
		amount -= discount;
		
		System.out.println("Please pay final amount: \u20b9"+amount);
		
		// Assignment: 1. Try using Ternary Operators and implement the Promo Code Use Case wherever possible
		//			   2. Implement Conditional Constructs on the booking of a cab in ola/uber (as per your will)

	}

}
