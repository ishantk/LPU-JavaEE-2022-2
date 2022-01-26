class OneWayFlightBooking{
	
	String fromLocation;
	String toLocation;
	String departureDate;
	int numOfTravellers;
	String travelClass;
	
	OneWayFlightBooking(){
		fromLocation = "Delhi";
		toLocation = "Bangalore";
		departureDate = "27th Jan, 2022";
		numOfTravellers = 1;
		travelClass = "economy";
	}

	OneWayFlightBooking(String fromLocation, String toLocation, String departureDate, int numOfTravellers,
			String travelClass) {
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureDate = departureDate;
		this.numOfTravellers = numOfTravellers;
		this.travelClass = travelClass;
	}
	
	void show() {
		System.out.println("Booking Details");
		System.out.println("~~~~~~~~~~~~~~");
		System.out.println("From "+fromLocation+" To "+toLocation);
		System.out.println("On "+departureDate);
		System.out.println("For "+numOfTravellers+" In "+travelClass);
	}
	
}

/*class TwoWayFlightBooking{
	
	String fromLocation;
	String toLocation;
	String departureDate;
	int numOfTravellers;
	String travelClass;
	
	String returnDate;
	
	TwoWayFlightBooking(){
		fromLocation = "Delhi";
		toLocation = "Bangalore";
		departureDate = "27th Jan, 2022";
		numOfTravellers = 1;
		travelClass = "economy";
		returnDate = "30th Jan, 2022";
	}

	
	
	TwoWayFlightBooking(String fromLocation, String toLocation, String departureDate, int numOfTravellers,
			String travelClass, String returnDate) {
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureDate = departureDate;
		this.numOfTravellers = numOfTravellers;
		this.travelClass = travelClass;
		this.returnDate = returnDate;
	}



	void show() {
		System.out.println("Booking Details");
		System.out.println("~~~~~~~~~~~~~~");
		System.out.println("From "+fromLocation+" To "+toLocation);
		System.out.println("On "+departureDate);
		System.out.println("For "+numOfTravellers+" In "+travelClass);
		System.out.println("Return On: "+returnDate);
	}
	
}*/

class TwoWayFlightBooking extends OneWayFlightBooking{
	
	String returnDate;
	
	TwoWayFlightBooking(){
		//super(); // this is inserted automatically by the Compiler
	}

	TwoWayFlightBooking(String returnDate) {
		// this super is taken care by compiler
		//super(); // we will execute default constructor of Parent from the Parameterized Constructor
		this.returnDate = returnDate;
	}
	
	
	TwoWayFlightBooking(String fromLocation, String toLocation, String departureDate, int numOfTravellers,
			String travelClass, String returnDate) {
		// super as parent constructor execution 
		super(fromLocation, toLocation, departureDate, numOfTravellers, travelClass);
		this.returnDate = returnDate;
		
	}

	void show() {
		super.show(); // super as reference variable: access parent property i.e. attribute or method
		System.out.println("Return On: "+returnDate);
	}
	
	
}


public class WhyInheritance {

	public static void main(String[] args) {
		
		//OneWayFlightBooking booking = new OneWayFlightBooking();
		//OneWayFlightBooking booking = new OneWayFlightBooking("Chandigarh", "Goa", "30th Jan, 2022", 3, "business");
		//booking.show();
		
		//TwoWayFlightBooking booking = new TwoWayFlightBooking();
		//TwoWayFlightBooking booking = new TwoWayFlightBooking("30th Jan 2022");
		TwoWayFlightBooking booking = new TwoWayFlightBooking
				("Chandigarh", "Goa", "30th Jan, 2022", 3, "business", "30th Jan, 2022");
		booking.show();
		
		
		// Polymorphic Statement
		// reference variable of parent can refer to the child object
		OneWayFlightBooking ref = new TwoWayFlightBooking();
		
		// Vice Versa not possible
		//TwoWayFlightBooking tRef = new OneWayFlightBooking(); // error

	}

}
