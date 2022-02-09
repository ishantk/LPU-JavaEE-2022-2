package com.auribises.session17;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.auribises.bean.Product;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to AOP demo" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        // For AOP we need to configure -> ProxyFactoryBean in xml file
        // It has 2 attributes: 
        //			1. target 2. interceptroNames
        
        //Product pRef = context.getBean("product", Product.class);
        Product pRef = context.getBean("productProxy", Product.class);
        
        //System.out.println("[App] Product Details: ");
        //System.out.println(pRef);
        
        pRef.purchaseProduct("Home", "6PM Evenning", "john@example.com");
    }
}
