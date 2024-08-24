package com.practice.customer_services.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.customer_services.client.CustomerCallFlightService;
import com.practice.customer_services.dto.FlightDTO;

@RestController
public class CustomerServiceController {
	
	@Autowired
	CustomerCallFlightService callFlightService;
	
	@GetMapping("/callFlights")
	public List<FlightDTO> getData() {
		return callFlightService.getAllFlights();
	}
	
	@GetMapping("/checkCustomerService")
	public String getCustomerService() {
		return "UP.";
	}

}
