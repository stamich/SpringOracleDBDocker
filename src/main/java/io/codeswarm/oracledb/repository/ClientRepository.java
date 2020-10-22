package io.codeswarm.oracledb.repository;

import io.codeswarm.oracledb.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findAll();
//    Client findClientByEmail(String email);
//    List<Client> findClientByActive(Boolean active);
}
