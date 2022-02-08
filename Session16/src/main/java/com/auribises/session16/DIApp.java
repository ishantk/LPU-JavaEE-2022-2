package com.auribises.session16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.auribises.bean.Restaurant;

public class DIApp {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		Restaurant restaurant = context.getBean("rRef", Restaurant.class);
		System.out.println(restaurant);
		System.out.println(restaurant.getAddress());
		System.out.println("SEARCH KEYWORDS: "+restaurant.getSearchKeywords());

	}

}
