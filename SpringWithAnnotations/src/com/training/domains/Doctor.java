package com.training.domains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ent")
public class Doctor {

	@Value("Gaurav Pant")
	private String docName;

	@Value("9740591223")
	private long phoneNumber;

	@Autowired
	@Qualifier("inPat")
	private Patient patient;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {

		System.out.println("INIT CALLED ============");
	}

	@PreDestroy
	public void destroy() {

		System.out.println("DESTROY CALLED ============");
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Doctor [docName=" + docName + ", phoneNumber=" + phoneNumber + "]";
	}

}
