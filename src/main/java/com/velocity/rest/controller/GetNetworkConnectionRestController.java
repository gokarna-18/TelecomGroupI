package com.velocity.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.NetworkConnection;
import com.velocity.network_connection.service.GetNetworkConnectionService;

@RestController
public class GetNetworkConnectionRestController {
	
	// Inject GetNetworkConnectionService serice
	
	@Autowired
	GetNetworkConnectionService getNetworkConnectionService;
	
	
	// Design the restful webservice to get all network connections
	
	@GetMapping("/getNetowrkDetails")
	List<NetworkConnection> getNetworkConnection(){
		List<NetworkConnection> getNetworkConnection = getNetworkConnectionService.getNetworkConnection();
		
		return getNetworkConnection;
	}


}
