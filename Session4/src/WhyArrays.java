
public class WhyArrays {

	public static void main(String[] args) {
		
		// Single Value Containers -> Representing the data
		int usaActiveCases = 635462;
		int usaRecoveredCases = 73544521;
		int usaNewCases = 41324;
		
		int indiaActiveCases = 454643;
		int indiaRecoveredCases = 6253432;
		int indiaNewCases = 88781;
		
		// Simplify the data storage with Arrays
		// i.e. when we have lot of data with homogeneous profile, we must use arrays :)
		int[] usaCases = {635462, 73544521, 41324};
		int[] indiaCases = {454643, 6253432, 88781};
		int[] ukCases = {88734, 23909, 275345};
		
		
		int punjab = 1545;
		int himachal = 748;
		int up = 869;
		int goa = 86989;
		
		int total = punjab + himachal + up + goa; //.....
		
		int[] activeCasesInIndiaStatewise = {1545, 748, 869, 86989, 2364, 23234, 984, 122, 565};
		
		int totalActiveCases = 0;
		for(int element : activeCasesInIndiaStatewise) {
			totalActiveCases += element;
		}
		
		System.out.println("totalActiveCases: "+totalActiveCases);
		
		double[] data = {2.2, 3.3, 4.4};
		for(double anyName: data) {
			//...
		}

	}

}
