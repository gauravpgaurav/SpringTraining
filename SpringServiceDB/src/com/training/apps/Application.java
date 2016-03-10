package com.training.apps;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.ServiceRecordDAO;
import com.training.entity.ServiceRecord;

public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("resource/bean.xml");
		ServiceRecordDAO obj = ctx.getBean("dao", ServiceRecordDAO.class);
		ServiceRecord record = ctx.getBean("ServiceRecord", ServiceRecord.class);

		record.setServiceId("SR101");
		record.setCustomerName("Ramesh");
		record.setHandPhone(22822);
		record.setProductId("P101");
		record.setProductType("Mobile");
		record.setServiceDesc("Needs New Battery");

		// System.out.println("Number of Rows Added : \t" +
		// obj.add(record)+"\n");

		ServiceRecord findRecord = obj.find("SR101");
		System.out.println("Find Result : \n" + findRecord);

		System.out.println("\nFind All Result :");
		List<ServiceRecord> recordList = obj.findAll();
		for (ServiceRecord item : recordList) {
			System.out.println(item);
		}
		ctx.close();
	}

}
