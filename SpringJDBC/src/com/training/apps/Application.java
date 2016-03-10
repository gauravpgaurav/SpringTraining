package com.training.apps;

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

		boolean result = obj.add(inv);
		System.out.println("Row Added : " + result);
		ctx.close();

	}

}
