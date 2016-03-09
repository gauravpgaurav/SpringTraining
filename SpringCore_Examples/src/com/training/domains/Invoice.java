package com.training.domains;

public class Invoice {

	private long invoiceNumber;
	private Customer cust;
	private double amount;

	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", cust=" + cust + ", amount=" + amount + "]";
	}

	public Invoice(long invoiceNumber, Customer cust, double amount) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.cust = cust;
		this.amount = amount;
	}

	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}