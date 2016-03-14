package com.training.cntrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
public class CarRentalController {

	@RequestMapping("/")
	public String initApp() {
		return "index";
	}

	@Autowired
	private ModelAndView mdl;

	@Autowired
	private CarRental car;

	@RequestMapping(name = "/AddRequest", method = RequestMethod.GET)
	public ModelAndView initForm() {

		mdl.setViewName("CarRequest");
		mdl.addObject("command", car);

		return mdl;
	}

	@ModelAttribute("carType")
	public String[] types() {
		return new String[] { "Innova", "Indica A/C", "Indica Non A/C" };
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("carRentalObj") CarRental cr) {

		return "Welcome";
	}

}
