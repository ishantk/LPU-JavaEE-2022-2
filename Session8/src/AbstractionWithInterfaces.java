interface GPay{
	
	// default keyword can be used to create a method in interface
	default void payFromGPay(int amount) {
		System.out.println("[GPay] Payment Done for amount: "+amount);
		onPaymentSuccess();
	}
	
	void onPaymentSuccess();
	void onFailed();
}

interface PhonePe{
	
	// default keyword can be used to create a method in interface
	default void payFromPhonePe(int amount) {
		System.out.println("[PhonePe] Payment Done for amount: "+amount);
		onSuccess();
	}
	
	void onSuccess();
	void onFailed();
}

// Inheritance on Interfaces
// Interfaces can inherit in multiple way
interface SwiggyPaymentMethods extends GPay, PhonePe{
	
}

class SwiggyPayments implements SwiggyPaymentMethods{ //implements GPay, PhonePe{ // multiple implementation
	
	public void onPaymentSuccess() {
		System.out.println("[Swiggy] Payment Received from GPay");
		System.out.println("[Swiggy] We will deliver your order soon");
	}
	
	public void onFailed() {
		System.out.println("[Swiggy] Payment Failed");
		System.out.println("[Swiggy] Please use other payment method");
	}
	
	public void onSuccess() {
		System.out.println("[Swiggy] Payment Received from PhonePe");
		System.out.println("[Swiggy] We will deliver your order soon");
	}
	
}



public class AbstractionWithInterfaces {

	public static void main(String[] args) {
		
		//SwiggyPayments payments = new SwiggyPayments();
		//payments.payFromGPay(1000);
		//payments.payFromPhonePe(500);
		
		SwiggyPaymentMethods methods = new SwiggyPayments();
		//methods.payFromGPay(1000);
		methods.payFromPhonePe(500);
		

	}

}
