class PayTmMobileRecharge{
	
	private String mobileNumber;
	private String operator;
	private int amount;
	
	PayTmMobileRecharge(){
		mobileNumber = "";
		operator = "";
		amount = 10;
	}
	
	void showPayTmMobileRecharge() {
		System.out.println(mobileNumber+" with operator "+operator+" will be recharged for "+amount);
	}
	
	// Setter
	void setMobileNumber(String phone) {
		if(phone.isEmpty() || phone.length() < 10 || !phone.startsWith("+91")) {
			System.out.println("Please enter a valid phone number");
		}else {
			mobileNumber = phone;
		}
	}
	
	// Getter
	String getMobileNumber() {
		return mobileNumber;
	}
	
	void setOperator(String op) {
		
		String operators = "airtel, vodafone, jio, bsnl, idea, mtnl";
		
		if(operators.contains(op.toLowerCase())) {
			operator = op;
		}else {
			System.out.println("Please enter a valid Operator");
		}
	}
	
	String getOperator() {
		return operator;
	}
	
	void setAmount(int amt) {
		
		if(amt >=10 && amount <=20000) {
			amount = amt;
		}else {
			System.out.println("Please enter a Amount");
		}
	}
	
	int getAmount() {
		return amount;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		
		PayTmMobileRecharge recharge = new PayTmMobileRecharge();
		System.out.println("recharge is: "+recharge);
		
		// Direct Access to attributes can lead to invalid data by user :)
		
		// if we mark them private, their scope is now limited only in the boudary of class
		//recharge.mobileNumber = "-91 ha ha he he";
		//recharge.operator = "wow";
		//recharge.amount = -200;
		
		recharge.setMobileNumber("+1 4441 6609 12");
		recharge.setOperator("rogers");
		recharge.setAmount(-200);
		
		System.out.println();
		
		recharge.showPayTmMobileRecharge();

	}

}
