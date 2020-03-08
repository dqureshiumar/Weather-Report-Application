package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subscribe")
public class Subscribe {

	@Id
	private int id;
	private String email;
	@Override
	public String toString() {
		return "Subscribe [id=" + id + ", email=" + email + "]";
	}
	public Subscribe()
	{
		
	}
	public Subscribe(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
