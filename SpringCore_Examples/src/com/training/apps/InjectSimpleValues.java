package com.training.apps;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;

public class InjectSimpleValues {

	public static void main(String[] args) {

		// BeanFactory container = new
		// ClassPathXmlApplicationContext("bean.xml");
		ConfigurableApplicationContext container = new ClassPathXmlApplicationContext("bean.xml");

		Customer cust1 = (Customer) container.getBean("custBean1");

		Customer cust2 = container.getBean("custBean1", Customer.class);

		Customer cust3 = (Customer) container.getBean(Customer.class);

		System.out.println("Customer 1 : " + cust1);

		System.out.println("Hash Code Customer 1 : " + cust1);

		System.out.println("Customer 2 : " + cust2);

		System.out.println("Hash Code Customer 2 : " + cust2);

		System.out.println("Customer 3 : " + cust3);

		System.out.println("Hash Code Customer 3 : " + cust3);

		container.close();

	}

}
