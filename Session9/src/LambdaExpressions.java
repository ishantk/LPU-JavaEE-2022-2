// Functional Interface:
// An interface with just 1 single abstract method

@FunctionalInterface
interface Taxes{
	double computeTaxes(int amount);
	
	default void hello() {
		System.out.println("Hello");
	}
	
	static void wow() {
		System.out.println("wow");
	}
}

public class LambdaExpressions {

	public static void main(String[] args) {
		
		// Anonymous Class
		/*Taxes refVar = new Taxes() {
			public double computeTaxes(int amount) {
				return amount*0.18;
			}
		};
		*/
		
		// Lambda Expression: works only for functional interfaces :)
		/*Taxes refVar = (int amount) -> {
			return amount*0.18;
		};*/
		
		// ignore data type for inputs
		/*Taxes refVar = (amount) -> {
			return amount*0.18;
		};*/
		
		Taxes refVar = (amount) -> amount<=1000 ? amount*0.18 : amount*0.22;
		
		System.out.println("Taxes on 1000 are: "+refVar.computeTaxes(1000));
		System.out.println("Taxes on 2000 are: "+refVar.computeTaxes(2000));
		
		refVar.hello();
		Taxes.wow();
	}

}
