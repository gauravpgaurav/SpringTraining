package com.training.entity;

public class Isbn {

	private String intlCode;
	private String bookCode;
	private String category;

	public Isbn() {
		super();
	}

	public String getIntlCode() {
		return intlCode;
	}

	public void setIntlCode(String intlCode) {
		this.intlCode = intlCode;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Isbn [intlCode=" + intlCode + ", bookCode=" + bookCode + ", category=" + category + "]";
	}

}
