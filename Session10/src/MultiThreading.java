
class MovieTicket{
	
	String movieName;
	int seatNumber;
	
	MovieTicket(){
		
	}

	MovieTicket(String movieName, int seatNumber) {
		this.movieName = movieName;
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "MovieTicket [movieName=" + movieName + ", seatNumber=" + seatNumber + "]";
	}
	
}

/*class BookMyShowMovieTicketTask{
	
	void generateMovieTickets() {
		for(int i=1;i<=10;i++) {
			MovieTicket ticket = new MovieTicket("*SpiderMan*", i);
			System.out.println("[BMS] "+ticket);
			
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}*/

// Inheritance
// BookMyShowMovieTicketTask is child of Thread class
class BookMyShowMovieTicketTask extends Thread{
	
	// Define the instructions in the run method which we wish to execute in the child thread
	public void run() {
		for(int i=1;i<=10;i++) {
			MovieTicket ticket = new MovieTicket("*SpiderMan*", i);
			System.out.println("[BMS] "+ticket);
			
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

class PaymentTask{
	
}

// If a class is already extending other class, it cannot extend Thread as Multiple Inheritance is not supported in Java
//class PayTMMovieTicketTask extends PaymentTask, Thread{
class PayTMMovieTicketTask extends PaymentTask implements Runnable{
	
	public void run() {
		for(int i=1;i<=10;i++) {
			MovieTicket ticket = new MovieTicket("^Pushpa^", i);
			System.out.println("[PMT] "+ticket);
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class MultiThreading {

	// main is executed automatically whenever program runs
	// we say main is the method which contains some tasks
	// these tasks are the instructions inside the main method
	// which are executed by main thread
	public static void main(String[] args) {
		
		// T1
		System.out.println("[main] started");

		// T2
		BookMyShowMovieTicketTask bms = new BookMyShowMovieTicketTask();
		//bms.generateMovieTickets();
		
		System.out.println("1. State of bms: "+bms.getState()); // NEW
		
		// When a class implements Runnable
		Runnable ref = new PayTMMovieTicketTask();
		Thread pmt = new Thread(ref);
		
		bms.setName("BMS");
		pmt.setName("PMT");
		
		bms.setPriority(Thread.MAX_PRIORITY); // 10
		pmt.setPriority(Thread.MIN_PRIORITY); // 1
		//Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		System.out.println("bms name is: "+bms.getName()+" and priority is: "+bms.getPriority());
		System.out.println("pmt name is: "+pmt.getName()+" and priority is: "+pmt.getPriority());
		System.out.println("main name is: "+Thread.currentThread().getName()+" and priority is: "+Thread.currentThread().getPriority());
		
		bms.start(); // start method internally executes the run
		System.out.println("2. State of bms: "+bms.getState()); // RUNNABLE
		try {
			// join is executed immediately after the start method called on bms
			// ensures, other threads to wait until its execution is not finished :)
			bms.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("3. State of bms: "+bms.getState()); // TERMINATED
		
		pmt.start();
		
		// T3
		for(int i=1;i<=10;i++) {
			MovieTicket ticket = new MovieTicket("~Avengers~", i);
			System.out.println("[main] "+ticket);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// T4
		System.out.println("[main] finished");
		
	}
	

}
