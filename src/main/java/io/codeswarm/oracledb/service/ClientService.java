package io.codeswarm.oracledb.service;

import io.codeswarm.oracledb.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientService {
    List<Client> findAll();
    List<Client> findClientByActive(Boolean active);
    Client findClientById(Long id);
    Client findClientByEmail(String email);
    void create(Client client);
    void update(Client client);
    void deleteClientById(Long id);
    boolean isClientEmailUnique(Long id, String email);
}
