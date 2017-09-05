package com.example.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {
	@org.springframework.data.annotation.Id
	String id;
	String name;	
	
	public String getId() {	return id; }

	public void setId(String id) {this.id = id;}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name) {
		this.name = name;
	}

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}
					
}
