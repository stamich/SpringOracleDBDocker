package io.codeswarm.oracledb.service;

import io.codeswarm.oracledb.model.Client;
import io.codeswarm.oracledb.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
    List<Order> findAllByClient(Client client);
    Order findOneById(Long id);
    void create(Order order);
    void update(Order order);
    void deleteOrderById(Long id);
}
