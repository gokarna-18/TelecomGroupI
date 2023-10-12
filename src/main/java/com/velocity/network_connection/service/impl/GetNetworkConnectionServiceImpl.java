package com.velocity.network_connection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.NetworkConnection;
import com.velocity.network_connection.service.GetNetworkConnectionService;
import com.velocity.repository.GetNetworkConnectionRepository;

@Service
public class GetNetworkConnectionServiceImpl implements GetNetworkConnectionService {

	//Inject the  GetNetworkConnectionRepository repository
	
	@Autowired
	GetNetworkConnectionRepository getNetworkConnectionRepository;
	
	@Override
	public List<NetworkConnection> getNetworkConnection() {

		List<NetworkConnection> networkConnectionList = getNetworkConnectionRepository.findAll();
		
		return networkConnectionList;
	}

}
