package com.auribises.bean;

// Bean is a POJO class only and is a terminology in the Spring FW
// Bean is just like the model but with a mandatory presence of Getters and Setters
public class Connection {
	
	// Attributes
	String url;
	String username;
	String password;
	
	public Connection() {
		System.out.println("[Connection] Object Constructed with Default Constructor");
	}

	Connection(String url, String username, String password) {
		System.out.println("[Connection] Object Constructed with Paramterized Constructor");
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	// Getters and Setters are mandatory and must be public :)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
	// User defined methods and can be any name
	// but signature goes as void and no input
	public void myInit() {
		System.out.println("[Connection] myInit executed");
	}
	
	public void myDestroy() {
		System.out.println("[Connection] myDestroy executed");
	}

}
