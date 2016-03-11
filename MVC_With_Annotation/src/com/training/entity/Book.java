package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private long bookNumber;
	private String bookName;

	public Book() {
		super();
	}

	public long getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
