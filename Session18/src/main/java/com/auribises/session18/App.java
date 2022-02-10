package com.auribises.session18;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

import com.auribises.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ){
    
    	System.out.println( "Welcome to Hibernate App" );
        
		// SessionFactory will create Session
		SessionFactory sessionFactory = null;
		// Session is connection to DB and using this API we perform CRUD operations
		Session session = null;
		//Transaction API executes the SQL Statements as a transaction means commit and rollback feature
		Transaction transaction = null;
		
		try {
			
			// Read the hibernate configuration xml file -> Parse the XML File :)
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			
			// build Session Factory
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			// 1. Insert Operation
			/*Employee e1 = new Employee(null, "Kim", "kim@example.com", 30000);
			Employee e2 = new Employee(null, "Mike", "mike@example.com", 50000);
			Employee e3 = new Employee(null, "Leo", "leo@example.com", 90000);
			
			session.save(e1);
			session.save(e2);
			session.save(e3);
			System.out.println("Employees Saved in DB");
			*/
			// 2. Batch operation
			/*for(int i=1;i<=100;i++) {
				Employee e = new Employee(null, "Employee "+i, "employee"+i+"@example.com", 30000+i);
				session.save(e);
			}*/
			
			// 3. Read operation
			/*Employee emp = session.get(Employee.class, 5);
			System.out.println(emp);
			
			// 4. Update Operation
			emp.setName("Mike Watson");
			emp.setSalary(57901);
			
			session.update(emp);*/
			
			// 5. Delete Operation
			/*Employee emp = new Employee();
			emp.setEid(2);
			session.delete(emp);*/
			
			// 6. Read All Operation
			//String hql = "From Employee";
			/*String hql = "From Employee where salary > 30090";
			List<Employee> employees = session.createQuery(hql).list();
			employees.forEach((employee) -> System.out.println(employee));
			*/
			
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 30090));
			List<Employee> employees = criteria.list();
			employees.forEach((employee) -> System.out.println(employee));
			
			
			transaction.commit();
			System.out.println("Transaction Committed by hibernate :)");
			session.close();
			sessionFactory.close();
			
		} catch (Exception e) {
			System.err.println("Exception is: "+e);
		}
        
    }
}
