package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	Long id;
	String email;
	String jobTitle;
	String name;
	String phone;
	String imageUrl;
	@Column(nullable = false, updatable = false)
	String employeeCode;
	
	public Employee() {
	}

	public Employee(Long id, String email, String jobTitle, String name, String phone, String imageUrl,
			String employeeCode) {
		super();
		this.id = id;
		this.email = email;
		this.jobTitle = jobTitle;
		this.name = name;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email + ", jobTitle=" + jobTitle + ", name=" + name + ", phone="
				+ phone + ", imageUrl=" + imageUrl + ", employeeCode=" + employeeCode + "]";
	}
}
