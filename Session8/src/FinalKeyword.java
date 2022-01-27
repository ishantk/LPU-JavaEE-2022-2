final class PaymentGateway{ // final class cannot be inherited
	
	//final void pay(int amount) { // final method cannot be overrided
	void pay(int amount) { 
		System.out.println("[PaymentGateway]: Payment done successfully for amount "+amount);
	}
	
}

class MyAppPaymentsPage{// extends PaymentGateway{
	
	/*void pay(int amount) {
		amount+=50;
		System.out.println("[MyAppPaymentsPage]: Thank you for order of amount "+amount);
	}*/
	
	void placeOrderAndPay(int amount) {
		PaymentGateway gateway = new PaymentGateway();
		gateway.pay(amount);
	}
}


public class FinalKeyword {

	public static void main(String[] args) {
		
		final String appName = "eStore";
		
		// constants appName cannot be modified
		//appName = "eStore - Shop Anywhere";
		
		MyAppPaymentsPage payment = new MyAppPaymentsPage();
		//payment.pay(3000);
		
		payment.placeOrderAndPay(2500);
		

	}

}
