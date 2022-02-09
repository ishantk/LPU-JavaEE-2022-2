package com.auribises.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	final String TAG = "[BeforeAdvice] ";
	
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println(TAG+"before executed for "+method.getName());

		// 1. Pre Processing -> Validate for the Stock
		if(method.getName().equals("purchaseProduct")) {
			
			Product product = (Product)target;
			
			if(product.stock > 0) {
				System.out.println(TAG+"Stock Validated !");
				System.out.println(TAG+"Initiating Payment Transaction...");
				System.out.println();
				product.canBuy = true;
			}else {
				System.out.println(TAG+" Sorry. We are out of Stock...");
			}
		}
		
	}

}
