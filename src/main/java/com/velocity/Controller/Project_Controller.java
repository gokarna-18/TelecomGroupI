package com.velocity.Controller;


import com.velocity.Bean.ConnectionList;
import com.velocity.Service.ConnectionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project_Controller {
    @Autowired
    private ConnectionListService connectionListService;

    @PutMapping("/updateConnection")
    public ConnectionList updateConnectionList(@RequestBody ConnectionList connectionList){
        ConnectionList connectionList1 = connectionListService.updateConnectionList(connectionList);
        return connectionList1;
    }
}
