import java.util.Scanner;

class Cab{
	
	int baseFare;
	int pricePerKm;
	
	Cab(){
		baseFare = 50;
		pricePerKm = 10;
		System.out.println("[Cab] Object Constructed");
	}
	
	void bookCab(String source, String destintion, int distance) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("[Cab] Booked from "+source+" to "+destintion);
		System.out.println("[Cab] Please Pay: \u20b9"+(baseFare+(distance*pricePerKm)));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

class PrimeCab extends Cab{
	
	String wifiUserName;
	String wifiPassword;
	int chips;
	int softDrinks;
	
	PrimeCab(){
		baseFare += 30;
		pricePerKm += 8;
		wifiUserName = "guest";
		wifiPassword = "guest@123";
		chips = 3;
		softDrinks = 2;
		System.out.println("[PrimeCab] Object Constructed");
	}
	
	void bookCab(String source, String destintion, int distance) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("[PrimeCab] Booked from "+source+" to "+destintion);
		System.out.println("[PrimeCab] You can access the internet with Wifi "+wifiUserName+" and Password "+wifiPassword);
		System.out.println("[PrimeCab] You can eat "+chips+" type of chips");
		System.out.println("[PrimeCab] You can drink "+softDrinks+" type of soft drinks");
		System.out.println("[PrimeCab] Please Pay: \u20b9"+(baseFare+(distance*pricePerKm)));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

class SharedCab extends Cab{
	
	int numOfPassengers;
	
	SharedCab(){
		baseFare -= 20;
		pricePerKm -= 2;
		numOfPassengers = 5;
		System.out.println("[SharedCab] Object Constructed");
	}
	
	void bookCab(String source, String destintion, int distance) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("[SharedCab] Booked from "+source+" to "+destintion);
		System.out.println("[SharedCab] You will be sharing cab with "+numOfPassengers+" passengers");
		System.out.println("[SharedCab] Please Pay: \u20b9"+(baseFare+(distance*pricePerKm)));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	void stopTrip() {
		System.out.println("Thank You for Riding with Us");
	}
}

// Factory Design Pattern
class CabFactory{
	
	static Cab selectCab(int typeOfCab) {
		
		Cab cab = null;
		
		if(typeOfCab == 1) {
			cab = new PrimeCab();
		}else if(typeOfCab == 2) {
			cab = new SharedCab();
		}else {
			System.out.println("Invalid Seslection for the Cab");
		}
		
		return cab;
	}
	
}


public class RTP {

	public static void main(String[] args) {
		
		/*Cab cab;
		cab = new Cab();
		cab.bookCab("Home", "Work", 6);*/
		
		/*PrimeCab primeCab;
		primeCab = new PrimeCab();
		primeCab.bookCab("Home", "Work", 6);*/
		
		/*SharedCab sharedCab;
		sharedCab = new SharedCab();
		sharedCab.bookCab("Home", "Work", 6);*/
		
		// Polymorphic Statement: Ref Var of Parent can refer to the Child Object
		/*Cab cab;
		
		cab = new PrimeCab();
		cab.bookCab("Home", "Work", 6);
		
		System.out.println();
		
		cab = new SharedCab();
		cab.bookCab("Home", "Work", 6);*/
		
		// error
		//cab.stopTrip();
		
		// with parent's ref var we can pnly execute the methods which are in parent or overrided by child(ren)
		
		System.out.println("Select the Cab");
		System.out.println("1. Prime\n2. Shared");
		
		Scanner scanner = new Scanner(System.in);
		int selection = scanner.nextInt();
		
		Cab cab = CabFactory.selectCab(selection);
		
		if(cab != null) {
			cab.bookCab("Home", "Work", 7);
		}

		scanner.close();
	}

}
