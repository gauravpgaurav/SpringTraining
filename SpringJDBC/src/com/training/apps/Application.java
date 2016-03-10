package com.training.apps;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.InvoiceDaoImpl;
import com.training.entity.Invoice;

public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		InvoiceDaoImpl obj = ctx.getBean("dao", InvoiceDaoImpl.class);
		Invoice inv = ctx.getBean("invoice", Invoice.class);

		inv.setInvoiceNumber(201);
		inv.setCustomerName("Ramesh");
		inv.setAmount(12.0);
		boolean result =false;
		
		result = obj.delete(201);
		System.out.println("Row Deleted : " + result);
		
		result = obj.add(inv);
		System.out.println("Row Added : " + result);

		Invoice findInvoiceObj = obj.find(201);
		System.out.println("Find Result : " + findInvoiceObj);

		List<Invoice> invoiceList = obj.findAll();
		for (Invoice item : invoiceList)
			System.out.println(item);

		ctx.close();

	}

}
