
public class Methods {
	
	// Function is created inside the class
	// In Java, we call the function as a Method
	
	// return type: it can be any possible data type i.e. primitive or reference
	//				this is to return something at the end of function
	// we can specify it as void, if no data has to be returned
	// here in our case below it is int
	
	// name -> f
	//		   ideally a meaningful name following the camel case
	//         i.e. startWithLowerAndThenUpperCase
	
	// definition -> what function should do { }
	
	// return statement is the last statement in our function
	//	i.e. wherever return statement will occur in the function that will terminate the function
	
	//int f(int x, int y) {
	static int f(int x, int y) {
		
		//return 0; // end the function i.e. terminate it here
		
		//int result = x*x + y*y + 2*x*y;
		//return result;
		
		return (x*x + y*y + 2*x*y);
	}

	public static void main(String[] args) {
		
		// f(x, y) = x*x + y*y + 2*x*y
		// f(1, 2) = 1*1 2*2 + 2*1*2 => 9
		
		// Methods can be:
		// 1. non static
		// 2. static
		
		// Executing a non static method:
		// we need the object's reference for that class
		/*Methods refVar = new Methods(); // Object :)
		int result = refVar.f(10, 20);
		System.out.println("Result is: "+result);*/
		
		// Executing a static method:
		//int result = Methods.f(10, 20);
		
		// in case static method and main belongs to the same class, we can skip the class name as well
		int result = f(10, 20);
		System.out.println("Result is: "+result);
		

	}

}
