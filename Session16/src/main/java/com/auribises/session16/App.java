package com.auribises.session16;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.auribises.bean.Connection;

public class App {
	
    public static void main( String[] args ){
       
    	System.out.println("Welcome to Spring Core Session");
        
        // Traditionally we create objects in java using new keyword
        // Programatically we add data in object
        /*Connection con1 = new Connection();
        con1.setUrl("jdbc:mysql//localhhost/estore");
        con1.setUsername("root");
        con1.setPassword("pass123");
        
        System.out.println("con1 is: ");
        System.out.println(con1);*/
        
        // As the part of security, we may change the password regularly for db
        // Hence, in our above example we will need to recompile and redeploy the code everytime we change password
        
        // Spring FW is the Solution
        
        // Spring Procedure Steps:
        // 1. Configure dependencies i.e. Jar files for Spring Core
        // 2. Create XML file in src directory and configure java objects their
        //			Reference Link: https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#spring-core
        // 3. Use IOC i.e. Inversion of Control
        //    IOC: we will not create objects as developer, let Spring FW create it for us
        //    IOC Containers, which will manage the objects for use from creation till destruction
        // 	  3.1 BeanFactory
        //    3.2 ApplicationContext
        // 4. Use IOC Containers to get the reference of the Beans i.e. Java Objects and use them in your program
        // 5. Close the Context to remove the objects (optional)
        
        //3.1 BeanFactory
        //Resource resource = new ClassPathResource("beans.xml");
        //BeanFactory factory = new XmlBeanFactory(resource);
        
        // BeanFactory IOC Container will not create the objects when we instantiate it
        // Objects will be created when we request for them using getBean method :)
        
        // Hence, BeanFactory IOC Container creates the object in lazy format
        
        /*Connection c1 = (Connection)factory.getBean("con1");
        Connection c2 = factory.getBean("con2", Connection.class);
        Connection c3 = factory.getBean("con1", Connection.class);
        
        System.out.println("c1 is: "+c1+" and hashcode is: "+c1.hashCode());
        System.out.println("c2 is: "+c2+" and hashcode is: "+c2.hashCode());
        System.out.println("c3 is: "+c3+" and hashcode is: "+c3.hashCode());*/
        
        // 3.2 ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // ApplicationContext IOC Container will create the objects when we instantiate it
        // Objects will be created before hand i.e. before using getBean method :)
        // Hence, ApplicationContext IOC Container creates the object in eager format
        
        Connection c1 = (Connection)context.getBean("con1");
        //Connection c2 = context.getBean("con2", Connection.class);
        //Connection c3 = context.getBean("con1", Connection.class);
        
        System.out.println("c1 is: "+c1+" and hashcode is: "+c1.hashCode());
        //System.out.println("c2 is: "+c2+" and hashcode is: "+c2.hashCode());
        //System.out.println("c3 is: "+c3+" and hashcode is: "+c3.hashCode());
        
        ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
        cxt.close(); // Close the ApplicationContext
        
    }
}
