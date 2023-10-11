package com.velocity.ServiceImplementation;

import com.velocity.Bean.ConnectionList;
import com.velocity.Repository.ConnectionListRepository;
import com.velocity.Service.ConnectionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConnectionListServiceImpl implements ConnectionListService {
    @Autowired
    private ConnectionListRepository connectionListRepository;
    @Override
    public ConnectionList updateConnectionList(ConnectionList connectionList) {
        ConnectionList save = connectionListRepository.save(connectionList);
        return save;
    }
}
