package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.velocity.model.NetworkConnection;

@Repository
public interface GetNetworkConnectionRepository extends JpaRepository<NetworkConnection,Integer> {

}
