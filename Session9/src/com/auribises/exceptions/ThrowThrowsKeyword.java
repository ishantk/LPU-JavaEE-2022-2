package com.auribises.exceptions;

import java.io.IOException;

/*

Exception Hierarchy

Throwable
	Exception
		RuntimeException  => RuntimeException and its children => UN-CHECKED EXCEPTION
			.
			...
			......
			
		All other exceptions are known as CHECKED EXCEPTION	
		IOException
			.
			...
			......
		SQLException
		.
		...
		......
		
	As per RTP i.e. Polymorphic Statement
	Parent Exception ref var can refer to any Exception child Object :)	

*/

// User Defined Exception
// UnChecked Exception -> as it is child of RuntimeException
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

// User Defined Exception
// Checked Exception -> as it is child of Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}


class BankAccount{
	
	String name;
	int balance;
	int minBalance;
	int attempts;
	
	
	BankAccount(){
		minBalance = 2000;
		attempts = 0;
	}

	BankAccount(String name, int balance) {
		this();
		this.name = name;
		this.balance = balance;
	}
	
	void checkBalance() {
		System.out.println(name+" has a balance of "+balance);
	}
	
	void withdraw(int amount) throws IOException, YourBankingException {
		balance -= amount;
		
		if(balance < minBalance) {
			balance += amount;
			System.out.println("[FAILURE] Withdraw not possible. Balance is Low: "+balance);
			attempts++;
		}else {
			System.out.println("[SUCCESS] Withdraw done. New Balance is: "+balance);
		} 
		
		if(attempts == 3) {
			
			// ArithmeticException -> built in exception class
			// it is child of RuntimeException class
			// created the object of UNCHECKED EXCEPTION :)
			// ArithmeticException exception = new ArithmeticException("Illegal Attempts: "+attempts);
			
			//MyBankingException exception = new MyBankingException("Illegal Attempts: "+attempts);
			
			
			
			// IOException is not the child of  RuntimeException class
			// It means, if we are throwing IOException it is a CHECKED EXCEPTION
			//IOException exception = new IOException("Illegal Attempts: "+attempts);
			
			YourBankingException exception = new YourBankingException("Illegal Attempts: "+attempts);
			throw exception; // we are crashing the program ourselves
		}
	}
	
}


public class ThrowThrowsKeyword {

	public static void main(String[] args) {
		
		System.out.println("Banking App Started");
		
		BankAccount account = new BankAccount("Fionna", 10000);
		account.checkBalance();
		
		try {
			for(int i=1;i<=5000;i++) {
				account.withdraw(3000);
			}
		}catch(Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
		
		System.out.println("Banking App Finished");
	}

}
