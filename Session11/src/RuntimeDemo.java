
class Student{
	
	int roll;
	String name;
	
	Student(){
		
	}
	
	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	// acts as a destructor.
	// gets executed when object is removed from memory
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object deleted: "+roll+" "+name);
	}
	
}

public class RuntimeDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "John");
		Student s2 = new Student(2, "Fionna");
		
		// Reference to Java Runtime
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Processors: "+runtime.availableProcessors());
		System.out.println("Free memory: "+runtime.freeMemory());
		System.out.println("Max memory: "+runtime.maxMemory());
		System.out.println("Total memory: "+runtime.totalMemory());

		// in case we update references to null, objects will be instantly deleted from memory when gc is executed
		s1 = null;
		s2 = null;
		
		runtime.gc();
		//System.gc();
		
	}

}

// assignment: analyze the memory like free memory after deleting the objects i.e. executing gc call
