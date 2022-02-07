package com.auribises.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	
 	create table User(
 		uid int primary key auto_increment,
 		name varchar(256),
 		email varchar(256),
 		password varchar(256),
 		regsiteredOn datetime
 	);
 		
 	
 */

public class User {
	
	public int uid;
	public String name;
	public String email;
	public String password;
	public String regsiteredOn;
	
	public User(){
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		regsiteredOn = formatter.format(date);
	}
	
	public User(int uid, String name, String email, String password, String regsiteredOn) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.regsiteredOn = regsiteredOn;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", password=" + password + ", regsiteredOn="
				+ regsiteredOn + "]";
	}
	
	public String toInsertSQL() {
		return "insert into User values(null, '"+name+"', '"+email+"', '"+password+"', '"+regsiteredOn+"')";
	}
	
	public String toSelectSQL() {
		return "select * from User where email = '"+email+"' and password = '"+password+"'";
	}
}
