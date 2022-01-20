
public class BreakContinue {

	public static void main(String[] args) {
		
		
		int myFloor = 5;
		
		for(int floor=1;floor<=10;floor++) {
			System.out.println("Lift is now at floor#"+floor);
			
			if(floor == myFloor) {
				System.out.println("My Floor Arrived :)");
				break; // terminate the loop :)
			}
			
		}
		
		System.out.println();
		
		for(int roll=1;roll<=10;roll++) {
			
			if(roll<=5) {
				continue; // skips the statements below and moves the loop into next iteration
			}
			
			System.out.println("Lets Start Viva for Roll#"+roll);
			System.out.println("Thank You Roll#"+roll+". Your Viva is Done");
			System.out.println();
			
		}

		// Assignment:  1. Explore the labels with break and continue in Loops :)
		
	}

}
