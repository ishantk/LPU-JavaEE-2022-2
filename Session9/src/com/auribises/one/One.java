package com.auribises.one;

// public class
public class One {
	
	// we can have both attributes and methods marked as private, default, protected or public

	private void pvtShow() {
		System.out.println("[One] This is private show");
	}
	
	void defShow() {
		System.out.println("[One] This is default show");
	}
	
	protected void protShow() {
		System.out.println("[One] This is protected show");
	}
	
	public void pubShow() {
		System.out.println("[One] This is public show");
	}
	
}

// default class
class Two{
	
	private void pvtShow() {
		System.out.println("[Two] This is private show");
	}
	
	void defShow() {
		System.out.println("[Two] This is default show");
	}
	
	protected void protShow() {
		System.out.println("[Two] This is protected show");
	}
	
	public void pubShow() {
		System.out.println("[Two] This is public show");
	}
	
	
}

// error: we cannot create private or protected class :)
/*
private class Three{
	
}

protected class Four{
	
}
*/

// More then 1 public class not allowed
/*public class Five{
	
}*/