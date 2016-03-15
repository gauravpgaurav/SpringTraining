package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Gaurav")
	private String studentName;
	@Value("22822")
	private long handPhone;

	public Student() {
		super();
	}

	public Student(String studentName, long handPhone) {
		super();
		this.studentName = studentName;
		this.handPhone = handPhone;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", handPhone=" + handPhone + "]";
	}

}
