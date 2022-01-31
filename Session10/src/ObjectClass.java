// Class -> Object
// Object is the parent class for all the classes in Java
// Hence RTP at Object level i.e. 
// Reference Variable of Object can refer to any Class in Java

//class Student extends Object{
class Student { // extends Object will be done by compiler for us
	
	int rollNumber;
	String name;
	
	Student(){
		
	}

	Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	public int hashCode() {
		return rollNumber;
	}
	
	// override equals here and compare 2 student objects with data :)

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
	/*void show() {
		System.out.println("Student Details: "+rollNumber+" "+name);
	}*/
	
	/*public String toString() {
		return rollNumber+" "+name;
	}*/
	
	
	
}

public class ObjectClass {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "John");
		Student s2 = new Student(1, "John");
		
		System.out.println("s1 is: "+s1);
		System.out.println("s1.toString() is: "+s1.toString());
		
		//s1.show();
		
		System.out.println("s1 class is: "+s1.getClass());
		
		
		System.out.println("s1 hashcode is: "+s1.hashCode());
		System.out.println("s2 hashcode is: "+s2.hashCode());
		
		
		/*Object oRef = new Student();
		oRef = new String();
		oRef = new RuntimeException();*/
		
		
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		if(s1.equals(s2)) { // for s1 and s2 should return true
			System.out.println("s1 equals s2");
		}else {
			System.out.println("s1 not equals s2");
		}
		
		// Assignment: use equals method in Student class as overrided version to compare 2 objects
		//			   you can google it and solve it :)

	}

}
