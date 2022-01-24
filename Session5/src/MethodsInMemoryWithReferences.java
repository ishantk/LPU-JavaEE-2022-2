import java.util.Arrays;
import java.util.Scanner;

public class MethodsInMemoryWithReferences {
	
	
	static void squareOfNumbers(int[] numbers) { // array as input
		System.out.println("[SqON] started");
		
		System.out.println("[SqON] numbers is: "+numbers);
		System.out.println("[SqON] numbers before is: "+Arrays.toString(numbers));
		
		for(int i=0;i<numbers.length;i++) {
			//numbers[i] = numbers[i] * numbers[i];
			numbers[i] *= numbers[i];
		}
		
		System.out.println("[SqON] numbers after is: "+Arrays.toString(numbers));
		
		System.out.println("[SqON] finished");
	}

	public static void main(String[] args) {
		
		System.out.println("[main] started");
		
		// data is a reference variable now
		// it holds the hash code of the array :)
		int[] data = {10, 20, 30, 40, 50};
		System.out.println("[main] data is: "+data); // hashcode
		System.out.println("[main] data before is: "+Arrays.toString(data)); // values
		
		squareOfNumbers(data);  // Reference Copy Operation :)
		
		System.out.println("[main] data after is: "+Arrays.toString(data)); // values

		
		System.out.println("[main] finished");
		
		// gc is a static method as it is accessed by class name :)
		// System.gc();
		
		//Scanner scannerRef = new Scanner(System.in);
		//scannerRef.nextInt();

	}

}

// when we execute the java program on the command line
// java NameOfClassWithMainMethod
