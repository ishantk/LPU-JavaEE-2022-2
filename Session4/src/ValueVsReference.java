
public class ValueVsReference {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a; // Value Copy :)
		
		b += 5; // increment b by 5
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
		// Here a and b are different storage containers
		
		int[] a1 = {1, 2, 3, 4, 5};
		System.out.println("a1 is: "+a1);
		
		int[] a2 = a1; // Reference Copy :)
		System.out.println("a2 is: "+a2);
		
		// a1 and a2 are different reference variables, but they hold the same hashcode :)
		// Hence, we have only 1 array in the Heap which is shared by 2 references a1 and a2
		
		// Let a2 modify the 2nd index in array
		a2[2] = 9;

		// Now, let us read the entire a1
		System.out.println("a1 contents: ");
		for(int element: a1) {
			System.out.print(element+"  ");
		}
		
		System.out.println();
		
		for(int idx=0;idx<a1.length;idx++) {
			a1[idx] = a1[idx] * a1[idx];
		}
		System.out.println();
		
		System.out.println("a1 contents: ");
		for(int element: a1) {
			System.out.print(element+"  ");
		}
		
		System.out.println();
		
		System.out.println("a2 contents: ");
		for(int element: a2) {
			System.out.print(element+"  ");
		}
		

	}

}
