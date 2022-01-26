class User{
	
	String name;
	String phone;
	String email;
	
	// address reference variable will refer to some Address object
	Address address; // Has-A Relationship | 1 to 1
	
	// reference to the array of Orders
	Order[] orders;  // Has-A Relationship | 1 to many
	
	User(){
		
	}

	User(String name, String phone, String email, Address address, Order[] orders) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.orders = orders;
	}

	void showUser() {
		System.out.println(name + " "+phone+" "+email);
		address.showAddress();
		
		System.out.println("Orders from "+name);
		for(Order order : orders) {
			order.showOrder();
		}
	}
	
}

class Address{
	
	String addressLine;
	String city;
	String state;
	int zipCode;
	String label;
	
	Address(){
		
	}

	Address(String addressLine, String city, String state, int zipCode, String label) {
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.label = label;
	}
	
	void showAddress() {
		System.out.println("Address Details: ");
		System.out.println(addressLine + " "+city+" "+state+" "+zipCode+" "+label);
		System.out.println();
	}
}

class Order{
	
	int oid;
	String date;
	int amount;
	
	// Assignment: Link array of Dishes for every order
	//             add up the dish quantity and price to make up the amount of order
	//Dish[] dishes;
	
	Order(){
		
	}

	Order(int oid, String date, int amount) {
		this.oid = oid;
		this.date = date;
		this.amount = amount;
	}
	
	void showOrder() {
		System.out.println("Order Details: "+oid+" "+date+" "+amount);
	}
}

public class HasARelationship {

	public static void main(String[] args) {
	
		Address aRef = new Address("Redwood Shores", "Bangalore", "Karnataka", 520001, "HOME");
		
		Order[]  array= new Order[3];
		array[0] = new Order(1, "22nd Jan, 2022", 300);
		array[1] = new Order(2, "24th Jan, 2022", 750);
		array[2] = new Order(3, "26th Jan, 2022", 500);
		
		
		User uRef = new User("John", "+91 99999 11111", "john@example.com", aRef, array);
		
		uRef.showUser();
	}

}
