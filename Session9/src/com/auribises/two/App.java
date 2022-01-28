package com.auribises.two;

import com.auribises.one.One; // One is public

// we cannot import default as it is accessible only within the package
//import com.auribises.one.Two; // Two is default

// private: accessible only in the class boundary
// default: accessible only in the package boundary
// protected: accessible only in the package boundary
// public: accessible anywhere and everywhere

// Package Level Inheritance
class CA extends One{
	
	void show() {
		//pvtShow(); // not accessible within the child
		//defShow(); // not accessible within the child
		protShow();  // accessible within the child class boundary
		pubShow();
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		// oRef.pvtShow(); // error
		// oRef.defShow(); // error
		// oRef.protShow(); // error
		//oRef.pubShow(); // OK
		
		CA cRef = new CA();
		// cRef.pvtShow(); // error
		// cRef.defShow(); // error
		// cRef.protShow(); // error
		// cRef.pubShow(); // OK
		
		cRef.show();
	}

}
