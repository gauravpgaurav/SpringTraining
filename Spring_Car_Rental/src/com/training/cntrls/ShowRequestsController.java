package com.training.cntrls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.entity.CarRental;

@Controller
public class ShowRequestsController {

	@RequestMapping("/showAll")
	public String getAllRequests(Model model) {

		List<CarRental> reqData = new ArrayList<CarRental>();

		reqData.add(new CarRental("Ramesh", 9740593422L, "ram@abc.com", "Innova"));
		reqData.add(new CarRental("Rajesh", 9740593411L, "raj@abc.com", "Indica A/C"));
		reqData.add(new CarRental("Rakesh", 9740593190L, "rak@abc.com", "Indica Non A/C"));

		model.addAttribute(reqData);
		return "ShowAllRequest";
	}

	@RequestMapping(value = "/findRequest/{name}", method = RequestMethod.GET)
	public String viewCustomerAddress(@PathVariable("name") String name, Model model) {

		String msg = "10 Bookings of " + name;
		if (name.equals("Ramesh")) {
			msg = "20 Bookings " + name;
		}
		model.addAttribute("data", msg);
		return "Display";
	}
}
