/*
 	
 	OOPS -> Object Oriented Programming Structure !! => emphasize is on Object :)
 			1. Object
 			2. Class
 			
 			Real World
 				Object: anything which is existing in reality
 				Class : drawing (blueprint) of an object
 				
 
 			Computer Science (world of programming)
 				Object: is a storage container i.e. a multi value container
 						we see object as a box
 						it can be homogeneous or hetrogeneous
 						
 						they are reference types :)
 						
 				Class: is a textual representation of object
 						i.e. we code the object as class :)
 						
 			Principle of OOPS:
 			1. Think of an object
 			2. Create its class
 			3. From the class create the real object in memory			
 			
 			
 			1. Think of an object
 			Q. How can we think of object ?
 			A. pickup the objects from the software requirement sheet. i.e. the problem statement will help us
 			identifying the objects
 			Objects will be those, who has lot of data associated to them
 			
 			Requirement: Create a Food Delivery App where a User can register. User should be able to see list
 			of restaurant alongwith their Dishes. User can place an Order from Restaurant.
 			Delivery Agent will pickup the Order from restaurant and deliver it to the User Address.
 	
 			1. Think of an object
 				User: name, phone, email, gender, addressLine, city, state, zipCode etc...
 				Restaurant: name, phone, email, image, operatingHours, ratings, reviews .....
 				Dish: name, price, description, image, quantity etc...
 				
 				User: name, phone, email, gender, addressLine, city, state, zipCode
 				
 				Object: User
 				Attributes: name, phone, email, gender, addressLine, city, state, zipCode
 				
 	
 */

// 2. Create its class
class User{ // representation of User Object: whatever we code in class belongs to object
	
	// Attributes: Created inside the class, but they are in actual for the object
	// hence, attributes are the property of object
	String name;
	String phone;
	String email;
	char gender;
	String addressLine;
	String city;
	String state;
	int zipCode;
	
}

public class OOPS {

	public static void main(String[] args) {
		
		// 3. From the class create the real object in memory
		User uRef1 = new User(); // new User(); -> creates an object at runtime in the heap area
		User uRef2 = new User();
		User uRef3 = uRef1; // Reference Copy Operation
		
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);
		
		System.out.println();
		
		// PS: uRef1, uRef2 and uRef3 are NOT Objects
		// They are reference variables which holds the hashcode of the object
		
		// Operations on Object
		// 1. Add Data into Object i.e. set the initial value for attributes in object
		uRef1.name = "john watson";
		uRef1.email = "john@example.com";
		uRef3.phone = "+91 99999 11111";
		uRef3.addressLine = "Redwood Shores";
		uRef1.zipCode = 141001;
		
		uRef2.name = "fionna flynn";
		uRef2.email = "fionna@example.com";
		uRef2.phone = "+91 90909 10101";
		uRef2.addressLine = "Country Homes";
		uRef2.zipCode = 141005;
		
				
		// 2. Update Data into Object i.e. set the new value for attributes in object
		uRef2.phone = "+91 98765 43210";
		
		// 3. Read data from Object i.e. use sysout statement
		System.out.println("uRef1 Details: ");
		System.out.println(uRef1.name+" can be called on "+uRef1.phone+" and lives in "+uRef1.addressLine);
		System.out.println();
		
		System.out.println("uRef2 Details: ");
		System.out.println(uRef2.name+" can be called on "+uRef2.phone+" and lives in "+uRef2.addressLine);
		System.out.println();
		
		System.out.println("uRef3 Details: ");
		System.out.println(uRef3.name+" can be called on "+uRef3.phone+" and lives in "+uRef3.addressLine);
		System.out.println();
		
		// 4. Remove data from Object -> not possible, we can get the entire object deleted by GC
		//System.gc();
		
	}

}
