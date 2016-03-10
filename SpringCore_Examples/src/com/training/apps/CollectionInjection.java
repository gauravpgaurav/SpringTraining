package com.training.apps;

import java.util.List;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;
import com.training.domains.Item;

class CollectionInjection {

	public static void main(String[] args) {

		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("Coll_Injection.xml");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Coll_Injection.xml");

		Invoice inv = ctx.getBean(Invoice.class);

		System.out.println("Invoice number:" + inv.getInvoiceNumber());
		System.out.println("Customer" + inv.getCust());
		System.out.println("Address" + inv.getCust().getAddr());

		List<Item> itemList = inv.getItemList();

		for (Item obj : itemList) {
			System.out.println(obj);
		}
		System.out.println("Amount" + inv.getAmount());

		ctx.close();
	}
}