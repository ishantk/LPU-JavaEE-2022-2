
class OneWayFlightBooking{
	
	// Attributes: Property of Object
	String fromLocation;
	String toLocation;
	String travelDate;
	int numberOfTravellers;
	String travelClass;
	
	// Constructors: Property of Object
	
	// Default Constructor
	// Same name as that of class name
	// has no input
	// has no return type
	OneWayFlightBooking(){
		fromLocation = "Delhi";
		toLocation = "Bangalore";
		travelDate = "26th Jan, 2022 | Wendesday";
		numberOfTravellers = 3;
		travelClass = "economy";
	}
	
	
	// Parameterized Constructors -> they have inputs
	// Constructor Overloading
	OneWayFlightBooking(String fl, String tl, String td, int nt, String tc){
		fromLocation = fl;
		toLocation = tl;
		travelDate = td;
		numberOfTravellers = nt;
		travelClass = tc;
	}
	
	// Methods: Property of Object
	
	// setter method -> which can set the new values for the object's attribute
	void setOneWayFlightBooking(String fl, String tl, String td, int nt, String tc){
		fromLocation = fl;
		toLocation = tl;
		travelDate = td;
		numberOfTravellers = nt;
		travelClass = tc;
	}
	
	void showOneWayFlightBooking() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Flight Booking Details: ");
		System.out.println(fromLocation+" to "+toLocation
				+" on "+travelDate+" for "+numberOfTravellers+" by "+travelClass);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
	
}

public class Constructors {

	public static void main(String[] args) {
		
		
		OneWayFlightBooking booking1 = new OneWayFlightBooking(); // -> OneWayFlightBooking(); execution of default constructor
		
		OneWayFlightBooking booking2 = new OneWayFlightBooking("Mumbai", "Goa", "27th Jan, 2022 | Thu", 8, "business");
		
		booking1.setOneWayFlightBooking("Delhi", "Chennai", "27th Jan, 2022 | Thu", 2, "economy");
		
		/*System.out.println("Fligh Booking Details: "+booking1.fromLocation+" to "+booking1.toLocation
				+" on "+booking1.travelDate+" for "+booking1.numberOfTravellers+" by "+booking1.travelClass);
		
		System.out.println();
		
		System.out.println("Fligh Booking Details: "+booking2.fromLocation+" to "+booking2.toLocation
				+" on "+booking2.travelDate+" for "+booking2.numberOfTravellers+" by "+booking2.travelClass);*/
		
		booking1.showOneWayFlightBooking();
		booking2.showOneWayFlightBooking();
		

	}

}
