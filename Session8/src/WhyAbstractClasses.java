
final class RazorPay{
	
	boolean isBankInterfaceUp = false;
	RazorPayCallBacks callbacks; // reference variable of the RazorPayCallBacks
	
	
	void pay(int amount) {
		
		if(isBankInterfaceUp) {
			System.out.println("[RazorPay] Payment Done for amount: "+amount);
			callbacks.onPaymentSuccess("Payment Received Successfully");
		}else {
			System.out.println("[RazorPay] Payment Failed for amount: "+amount);
			callbacks.onPaymentFailed("Payment Failed");
		}
	}
	
	// Polymorphic Statement
	void on(RazorPayCallBacks callbacks) { // RazorPayCallBacks callbacks = this;
		this.callbacks = callbacks;
	}
}

abstract class RazorPayCallBacks{
	abstract void onPaymentSuccess(String message);
	abstract void onPaymentFailed(String message);
}



class ZomatoPaymentsPage extends RazorPayCallBacks{
	
	void payForOrder(int amount) {
		RazorPay payRef = new RazorPay(); // execute RazorPay Code
		// this -> reference to the current object of ZomatoPaymentsPage
		payRef.on(this); // let us pass the reference to the current object of ZomatoPaymentsPage
		payRef.pay(amount);
	}
	
	void onPaymentSuccess(String message) {
		System.out.println("[ZOMATO] Payment Received");
		System.out.println("[ZOMATO] Your Order will be delivered soon");
	}
	
	void onPaymentFailed(String message) {
		System.err.println("[ZOMATO] Payment Failed");
		System.err.println("[ZOMATO] Please try with some other payment method");
	}
	
}

public class WhyAbstractClasses {

	public static void main(String[] args) {
	
		ZomatoPaymentsPage page = new ZomatoPaymentsPage();
		//System.out.println(page);
		
		page.payForOrder(2000);

	}

}
