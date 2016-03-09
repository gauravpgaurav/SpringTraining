package com.training.domains;

import java.util.logging.*;

public class Customer {

	private int customerId;
	private String customerName;
	private long phoneNumber;

	Logger log = Logger.getLogger(this.getClass().getName());

	public Customer() {
		super();
		log.info("Customer Initialized");
	}

	public Customer(int customerId, String customerName, long phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		log.info("Customer Initialized Using Fields");
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
		log.info("Set Customer Id Called");
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		log.info("Set Customer Name Called");
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
		log.info("Set Customer Phone Number Called");
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ "]";
	}

}
