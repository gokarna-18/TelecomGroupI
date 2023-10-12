package com.velocity.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.NetworkConnection;

import com.velocity.network_connection.service.NetworkConnectionService;

@RestController
public class NetworkConnectionRestController {
	
	
	@Autowired
	NetworkConnectionService networkConnectionService;
	
	
	// Design restful webservice to save Network connection
	
	@PostMapping("/saveNetworkConnection")
	public NetworkConnection saveConnection( @RequestBody NetworkConnection networkConnection) {
		NetworkConnection networkConnection1 =   networkConnectionService.saveConnection(networkConnection);
		
		return networkConnection1;
		
	}
	
	
	// Design restful webservice to get all available Network connection


}
