package com.auribises.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	final String TAG = "[AfterAdvice] ";
	
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(TAG+"afterReturning executed for "+method.getName());
		
		// 3. Post-Processing -> Notify Customer with an email and also to the departments
		if(method.getName().equals("purchaseProduct")) {
			
			Product product = (Product)target;
			
			if(product.canBuy) {
				System.out.println(TAG+"We will deliver "+product.name+" at "+args[0]+" by "+args[1]);
				System.out.println(TAG+"Email Sent to "+args[2]+" for invoice of "+product.price);
				System.out.println(TAG+"Notifying Dispatch and Shipment for the product delivery");
				
			}else {
				System.out.println(TAG+" Sorry. We are out of Stock...");
			}
		}

		
		
	}

}
