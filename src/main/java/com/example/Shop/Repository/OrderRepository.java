package com.example.Shop.Repository;


import com.example.Shop.User;
import com.example.Shop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {


    List<Order> findOrdersByIsProcess(boolean process);

    List<Order> findOrdersByIsProcessAndIsDone(boolean process ,boolean done);
    Order findOrderByIsProcessAndUser(boolean process , User user);

    List<Order> findOrdersByUser(User user);
}
