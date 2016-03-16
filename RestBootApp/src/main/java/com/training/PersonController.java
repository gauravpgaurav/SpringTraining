package com.training;

import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/person")
public class PersonController {

	Map<Integer, Person> personMap = new HashMap<>();
	ModelAndView mdl = new ModelAndView();
	RestTemplate restTemplate = new RestTemplate();

	@PostConstruct
	public void init() {
		personMap.put(1, new Person(1, "Ramesh", "Kumar", "ram@gmail.com"));
		personMap.put(2, new Person(2, "Rajesh", "Kumar", "raj@gmail.com"));
		personMap.put(3, new Person(3, "Rakesh", "Kumar", "rak@gmail.com"));
	}

	@RequestMapping("/all")
	public Collection<Person> getAll() {
		return personMap.values();
	}

	// @RequestMapping("/getAll")
	// public ModelAndView getAllPersons() {
	//
	// String obj =
	// restTemplate.getForObject("http://localhost:4040/person/all",
	// String.class);
	// mdl.addObject("personList", obj);
	// return mdl;
	// }
}
