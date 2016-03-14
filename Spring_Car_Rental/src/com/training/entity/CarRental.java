package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class CarRental {

	private String name;
	private long mobileNumber;
	private String email;
	private String type;

	public CarRental() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CarRental [name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + ", type=" + type
				+ "]";
	}

}
