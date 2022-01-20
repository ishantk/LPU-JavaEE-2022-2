
public class Loops {

	public static void main(String[] args) {
		
		// Print the first row of chessboard
		// 0 -> white
		// 1 -> black
		
		char whiteSquare = '\u25A0';
		char blackSquare = '\u25A1';
		
		/*System.out.print(whiteSquare+" "+blackSquare+" ");
		System.out.print(whiteSquare+" "+blackSquare+" ");
		System.out.print(whiteSquare+" "+blackSquare+" ");
		System.out.print(whiteSquare+" "+blackSquare+" ");*/
		
		// Loops or Iterations
		// When in the code we need to do the same thing n-number of times

		
		int idx = 1; // starting point
		
		// checks condition at entry
		/*while(idx<=4) { // ending point
			System.out.print(whiteSquare+" "+blackSquare+" "); // the statement to be repeated again and again i.e. n number of times
			idx++; // expression with which we will move from starting point to the ending point
		}*/
		
		// whenever the condition is wrong, the loop will be executed on a min of once :)
		/*do {
			System.out.print(whiteSquare+" "+blackSquare+" ");
			idx++;
		}while(idx<=4); // check condition at exit 
		*/
		
		for(int i=1;i<=4;i++) {
			System.out.print(whiteSquare+" "+blackSquare+" ");
		}
	}

}
