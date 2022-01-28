package com.auribises.exceptions;

/*

	Exception Hierarchy
	
	Throwable
		Exception
			RuntimeException
				.
				...
				......
			IOException
				.
				...
				......
			SQLException
			.
			...
			......
			
		As per RTP i.e. Polymorphic Statement
		Parent Exception ref var can refer to any Exception child Object :)	

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("CashBacks App Started");
		
		int[] cashbacks = {90, 100, 80, 75, 60, 25, 44, 19, 99};
		int luckyNumber = 0;
		int cashBackEarned = 0;
		int extraCashBack = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Lucky Number: ");
		
		try {
			luckyNumber = scanner.nextInt();
			cashBackEarned = cashbacks[luckyNumber+1];
		}/*catch(InputMismatchException refVar) {
			System.out.println("Something Went Wrong: "+refVar);
		}catch(ArrayIndexOutOfBoundsException refVar) {
			System.out.println("Something Went Wrong: "+refVar);
		}*/
		catch(Exception e) {
			//System.out.println("Something Went Wrong: "+e);
			e.printStackTrace(); // will share line number in the source code with complete track of error
		}finally {
			System.out.println("Finally....");
			if(cashBackEarned != 0) {
				extraCashBack = cashBackEarned/3;
			}else {
				extraCashBack = 5;
			}
			System.out.println("Extra CashBack Earned: "+extraCashBack);
			
			scanner.close();
		}
		
		System.out.println("CashBack Earned: "+cashBackEarned);
		
		System.out.println("CashBacks App Finished");

	}

}


// Exception: Error at Run time and it crashes the program
//			  Due to error at runtime program terminates abnormally


/*
 	
 		try{
 		
 		}catch(){
 		
 		}
 		
 		try{
 		
 		}finally{
 		
 		}
 		
 		try{
 		
 		}catch(){
 		
 		}finally{
 		
 		}
 		
 		try{
 		
 		}catch(){
 		
 		}catch(){
 		
 		}finally{
 		
 		} 
 		
 		try{
 		
 		 	try{
 		
	 		}catch(){
	 		
	 		}finally{
	 		
	 		}
 		
 		}catch(){

 		 	try{
 		
	 		}catch(){
	 		
	 		}finally{
	 		
	 		}
 		
 		}finally{
 		 	
 		 	try{
 		
	 		}catch(){
	 		
	 		}finally{
	 		
	 		} 		
 		} 				
 	
 */
