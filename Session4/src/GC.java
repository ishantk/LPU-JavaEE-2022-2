
public class GC {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50};
		String name = new String("John Watson");
		
		// arrays and strings are reference types
		// above, both will be created in the HEAP
		
		// from the heap, Garbage Collector deletes the unused objects automatically
		
		// GC is a program which runs in the JVM
		// GC checks after a certain interval of time if any object is unused or not
		// If unused remove from the memory
		
		// execute if you wish to release the unused objects from heap :)
		System.gc();

	}

}
