abstract class PayPal{
	abstract void onSuccess();
	abstract void onFailure();
}

abstract class PayTM{
	abstract void onSuccess();
	abstract void onFailure();
}

abstract class RPay{
	abstract void onSuccess();
	abstract void onFailure();
}

// We have a limitation for Zomato, not to extend more than 1 abstract class
// as per the rule multiple inheritance is not supported
/*class Zomato extends PayPal, PayTM, RPay{
	
}*/

// So this is now possible with interfaces !!


public class AbstractClassChallenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
