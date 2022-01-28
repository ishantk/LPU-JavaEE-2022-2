package com.auribises.one;

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		Two tRef = new Two();
		
		// oRef.pvtShow(); // error
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		// tRef.pvtShow(); // error
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		
	}

}

// private: which can only be accessed inside the class boundary
