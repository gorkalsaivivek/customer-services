package com.practice.customer_services.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.practice.customer_services.dto.FlightDTO;

@FeignClient(name = "flightService",url = "${flightService.url}")
public interface CustomerCallFlightService {
	
	@GetMapping("/flights")
	List<FlightDTO> getAllFlights();
	 
	

}
