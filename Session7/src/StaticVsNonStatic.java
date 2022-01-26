
class Dish{
	
	// non static attributes -> property of object i.e. they are created inside object as storage container
	String name;
	int price;
	int quantity;
	
	// static attribute -> property of class -> it is created inside the class as storgae container
	static int totalQuantity; // static attribute is accessible in non static methods
	static int numOfDishes;
	static int totalAmount; // use this variable and write some snippets to calculate the total amount
	
	Dish(){
		name = "Veggie Burger";
		quantity = 1;
		price = 76;
		numOfDishes++;
	}

	Dish(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		totalQuantity += quantity;
		numOfDishes++;
	}
	
	void increment() {
		quantity++;
		totalQuantity++;
	}
	
	void decrement() {
		quantity--;
		
		// static is accessible in non static
		totalQuantity--;
	}
	
	void showDish() {
		System.out.println("Dish: "+name+" "+price+" "+quantity);
	}
	
	// Property of Class
	static void show() {
		System.out.println("Total: "+totalQuantity);
		System.out.println("Total Dishes: "+numOfDishes);
		
		// Assignment: Compute the total amount and show it
		System.out.println("Total Amount: "+totalAmount); 
		
		// Property of Object is not accessible in Property of class
		// non static not accessible in static
		//System.out.println("Dish Name is: "+name); // error
	}
	
}


public class StaticVsNonStatic {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish("McAloo Tikki Burger", 46, 1);
		Dish dish2 = new Dish("McSpicy Paneer Wrap", 199, 1);
		Dish dish3 = new Dish();
		
		dish1.increment();
		dish1.increment();
		
		dish2.increment();
		dish2.increment();
		dish2.increment();
		
		dish1.decrement();
		
		dish1.showDish();
		dish2.showDish();
		
		
		System.out.println();
		Dish.show();
		System.out.println();
		
		
		//int[] array = {10, 20, 30};
		/*int[] array = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;*/
		
		// Array of Objects -> Array of Reference Variables
		//				  0      1      2
		//Dish[] array = {dish1, dish2, dish3};
		//System.out.println("array is: "+array);
		
		
		Dish[] array = new Dish[5];
		array[0] = dish1;
		array[1] = dish2;
		array[2] = dish3;
		array[3] = new Dish();
		array[4] = new Dish("Fires", 72, 2);
		
		/*for(int i=0;i<array.length;i++) {
			array[i].showDish();
		}*/
		
		for(Dish dish : array) {
			dish.showDish();
		}
		
	}

}
