package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private Double salary;
	
	private Date dob;

	
	//List<Employers> emplyers;
	
	public Long getId() {
		return id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public User(String name, String password, String email, Double salary, Date dob) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.salary = salary;
		this.dob = dob;
	}
	
	public User() {}
	

}
