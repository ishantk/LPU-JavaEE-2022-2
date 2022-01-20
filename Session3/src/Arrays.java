
public class Arrays {

	public static void main(String[] args) {
		
		int assignment1Marks = 90;
		int assignment2Marks = 80;
		int assignment3Marks = 85;
		int assignment4Marks = 72;
		int assignment5Marks = 64;
		
		// So, whenever we have lot of data to be processed, we need to use
		// Multi value Container :)
		// Array -> which says use homogeneous data
		
		// instead of creating 5 variables, we created a single variable marks
		// and stored 5 values :)
		int marks[] = {90, 80, 85, 72, 64};
		
		System.out.println("assignment1Marks is: "+assignment1Marks); // primitive type will give value as output
		System.out.println("marks is: "+marks); // reference type will give hashcode as output
		
		// assignment1Marks -> is a variable which stores value
		// marks -> is a reference variable which stores the hashcode of the Array
		//			and Array will be created inside the heap memory at run time
		
		/*System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);*/
		
		/*for(int idx=0;idx<marks.length;idx++) {
			System.out.println(marks[idx]);
		}*/
		
		// Enhanced For Loop / for-each loop | Read only loop
		for(int element : marks) {
			System.out.println(element);
		}
		
		
	}

}
