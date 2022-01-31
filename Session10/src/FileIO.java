import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Customer{
	
	String name;
	String phone;
	float temperature;
	String inDateTime;
	String outDateTime;
	
	Customer(){
		
	}

	Customer(String name, String phone, float temperature, String inDateTime, String outDateTime) {
		this.name = name;
		this.phone = phone;
		this.temperature = temperature;
		this.inDateTime = inDateTime;
		this.outDateTime = outDateTime;
	}

	@Override
	public String toString() {
		return name + "," + phone + "," + temperature + ","
				+ inDateTime + "," + outDateTime + "\n";
	}
	
}

class CovidCustomerManagementApp{
	
	FileIOOperations operations;

	CovidCustomerManagementApp(){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Covid CMS App");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		operations = new FileIOOperations();
	}
	
	void markEntryForCustomer() {
		Scanner scanner = new Scanner(System.in);
		Customer cRef = new Customer();
		
		System.out.println("Enter Customer Name: ");
		cRef.name = scanner.nextLine();
		
		System.out.println("Enter Customer Phone: ");
		cRef.phone = scanner.nextLine();
		
		System.out.println("Enter Customer inDateTime: ");
		cRef.inDateTime = scanner.nextLine();
		cRef.outDateTime = cRef.inDateTime;
		
		System.out.println("Enter Customer Temperature: ");
		cRef.temperature = scanner.nextFloat();
		
		
		scanner.close();
		
		System.out.println(cRef);
		
		//operations.writeInFile(cRef.toString());
		operations.writeInFileAsBinary(cRef.toString());
	}
	
	void readCustomerEntries() {
		//operations.readFromFile();
		operations.readFromFileAsBytes();
	}
	
}

class FileIOOperations{
	
	void writeInFile(String dataToWrite) {
		System.out.println("Data to Write: "+dataToWrite);
		
		try {
			File file = new File("customers.csv");
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true); // true -> enable append mode
			writer.write(dataToWrite);
			writer.close();
			System.out.println("Customer Saved using FW :)");
		}catch(Exception e) {
			System.out.println("Something went wrong: "+e);
		}
		
	}
	
	void writeInFileAsBinary(String dataToWrite) {
		System.out.println("Data to Write: "+dataToWrite);

		// Converting String data into bytes
		byte[] data = dataToWrite.getBytes();
		
		try {
			File file = new File("customers.csv");
			//FileOutputStream stream = new FileOutputStream(file);
			FileOutputStream stream = new FileOutputStream(file, true);
			stream.write(data);
			stream.close();
			System.out.println("Customer Saved using FOS :)");
		}catch(Exception e) {
			System.out.println("Something went wrong: "+e);
		}
		
	}
	
	void readFromFile() {
		
		try {
			File file = new File("customers.csv");
			FileReader reader = new FileReader(file); // read char by char
			BufferedReader buffer = new BufferedReader(reader); // read line by line
			
			String line = "";
			while((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();
			
		}catch(Exception e) {
			System.out.println("Something went wrong: "+e);
		}
		
	}
	
	void readFromFileAsBytes() {
		
		try {
			File file = new File("customers.csv");
			FileInputStream stream = new FileInputStream(file);
			//BufferedInputStream : explore yourself :)
			
			// Read byte by byte
			int data = 0;
			while((data = stream.read()) != -1) {
				System.out.print((char)data);
			}
			
			stream.close();
			
		}catch(Exception e) {
			System.out.println("Something went wrong: "+e);
		}
		
	}
	
	
	void generateNewClass(String className) {
				
		try {
			StringBuffer buffer = new StringBuffer();
			buffer.append("class "+className+"{\n\n");
			buffer.append("\tpublic static void main(String[] args){\n");
			buffer.append("\t\tSystem.out.println(\"Hello World\");\n");
			buffer.append("\t}\n}");
			
			File file = new File(className+".java");
			FileWriter writer = new FileWriter(file, true); // true -> enable append mode
			writer.write(buffer.toString());
			writer.close();
			System.out.println(className+".java file created");
		}catch(Exception e) {
			System.out.println("Something went wrong: "+e);
		}
		
	}
	
}


public class FileIO {

	public static void main(String[] args) {
		
		//CovidCustomerManagementApp app = new CovidCustomerManagementApp();
		//app.markEntryForCustomer();
		//app.readCustomerEntries();
		
		FileIOOperations operations = new FileIOOperations();
		operations.generateNewClass("MyApp");
	}

}

// Assignment: 1. Health Logger | Save the data in file
//			   2. Create a Java Program which counts the number of { } in a java program :)	
//				  2.1 In the same program count how many objects are constructed (wherever we will find new)
