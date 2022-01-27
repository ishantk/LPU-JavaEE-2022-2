// After marking the class as abstract
// we cannot create its objects ?
abstract class CallBacks{
	
	CallBacks() {
		System.out.println("CallBacks Constructed");
	}
	
	// abstract methods:
	// 1. they can be created with abstract keyword
	// 2. they can only be created inside the abstract class
	// 3. they are the rules, which child must define
	abstract void onSuccess();
	abstract void onFailure();
	
	void show() {
		System.out.println("Hello from show of CallBacks");
	}
}

class MyApp extends CallBacks{
	
	MyApp(){
		System.out.println("MyApp Constructed");
	}
	
	void onSuccess() {
		System.out.println("[MyApp] Payment is Successfully Received");
	}
	
	void onFailure() {
		System.out.println("[MyApp] Payment Failed");
	}
	
}

public class WhatIsAbstractClass {

	public static void main(String[] args) {
		
		MyApp app = new MyApp();
		app.onSuccess();
		app.onFailure();
		
		// abstract class objects cannot be created
		//CallBacks ref = new CallBacks(); // error

	}

}
