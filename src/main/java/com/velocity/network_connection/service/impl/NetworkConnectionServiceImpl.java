package com.velocity.network_connection.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.NetworkConnection;
import com.velocity.network_connection.service.NetworkConnectionService;
import com.velocity.repository.NetworkConnectionRepository;

@Service
public class NetworkConnectionServiceImpl implements NetworkConnectionService {
	
	@Autowired
	NetworkConnectionRepository networkConnectionRepository;

	@Override
	public NetworkConnection saveConnection(NetworkConnection networkConnection) {
		
		NetworkConnection networkConnection1 = networkConnectionRepository.save(networkConnection);
		return networkConnection1;
	}

}
