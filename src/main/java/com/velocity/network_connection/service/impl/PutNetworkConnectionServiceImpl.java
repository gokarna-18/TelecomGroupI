package com.velocity.network_connection.service.impl;

import com.velocity.model.NetworkConnection;
import com.velocity.repository.NetworkConnectionRepository;
import com.velocity.network_connection.service.PutNetworkConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PutNetworkConnectionServiceImpl implements PutNetworkConnectionService {

    @Autowired
    private NetworkConnectionRepository networkConnectionRepository;

    @Override
    public NetworkConnection putNetworkConnection(NetworkConnection networkConnection) {
        NetworkConnection networkConnection1=networkConnectionRepository.save(networkConnection);
        return networkConnection1;
    }
}
