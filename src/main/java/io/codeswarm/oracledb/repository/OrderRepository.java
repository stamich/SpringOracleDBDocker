package io.codeswarm.oracledb.repository;

import io.codeswarm.oracledb.model.Client;
import io.codeswarm.oracledb.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAll();
    List<Order> findAllByClient(Client client);
    Order findOneById(Long id);
    void deleteOrderById(Long id);
}
