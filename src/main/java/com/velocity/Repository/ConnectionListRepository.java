package com.velocity.Repository;

import com.velocity.Bean.ConnectionList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionListRepository extends JpaRepository<ConnectionList,Integer> {
}
