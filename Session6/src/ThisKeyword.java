class Student{
	
	// Attributes
	int roll;
	String name;
	
	Student(){
		System.out.println("this is: "+this);
	}
	
	// here as of now, attributes of object are same as that of inputs for constructor
	// so we cannot distinguish between lhs and rhs
	/*Student(int roll, String name){
		roll = roll;
		name = name;
	}*/
	
	// for the solution:
	Student(int roll, String name){
		
		// now here LHS this.roll belongs to the object's attribute and rhs is of Student Constructor
		this.roll = roll;
		this.name = name;
	}
	
	// this is a reference variable which refers to the Current Object
}


public class ThisKeyword {

	public static void main(String[] args) {

		//Student s1 = new Student(101, "John");
		Student s1 = new Student();
		System.out.println("s1 is: "+s1);
		
		System.out.println();
		
		
		Student s2 = new Student();
		System.out.println("s2 is: "+s2);

	}

}
