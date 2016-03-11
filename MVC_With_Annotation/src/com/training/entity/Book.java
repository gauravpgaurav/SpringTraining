package com.training.entity;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class Book {

	Logger log = Logger.getLogger("");
	private long bookNumber;
	private String subject;
	private String bookName;
	private Isbn code;

	public Book() {
		super();
		log.info("&&&&& Book Initiated &&&&&");
	}

	public long getBookNumber() {
		log.info("##### GET Book NUMBER CALLED #####");
		return bookNumber;
	}

	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
		log.info("%%%%% SET Book NUMBER CALLED %%%%%");
	}

	public String getSubject() {
		log.info("##### GET Book SUBJECT CALLED #####");
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		log.info("%%%%% SET Book SUBJECT CALLED %%%%%");
	}

	public String getBookName() {
		log.info("##### GET Book NAME CALLED #####");
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
		log.info("%%%%% SET Book NAME CALLED %%%%%");
	}

	public Isbn getCode() {
		log.info("##### GET Book ISBN CALLED #####");
		return code;
	}

	public void setCode(Isbn code) {
		this.code = code;
		log.info("%%%%% SET Book ISBN CALLED %%%%%");
	}

}
