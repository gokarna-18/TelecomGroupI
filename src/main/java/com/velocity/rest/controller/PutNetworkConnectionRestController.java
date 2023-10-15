package com.velocity.rest.controller;

import com.velocity.model.NetworkConnection;
import com.velocity.network_connection.service.PutNetworkConnectionService;
import com.velocity.network_connection.service.impl.PutNetworkConnectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PutNetworkConnectionRestController {

    @Autowired
    private PutNetworkConnectionService putNetworkConnectionService;

    @PutMapping("/PutConnection")
    public NetworkConnection putNetworkConnection(@RequestBody NetworkConnection networkConnection){
       NetworkConnection networkConnection1= putNetworkConnectionService.putNetworkConnection(networkConnection);
        return networkConnection1;
    }


}
