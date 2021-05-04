package com.project.coffee.service;

import com.project.coffee.model.Order;

import java.util.Set;

public interface OrderService {
    Set<Order> getOrders();
    Order getOrderById(Long id);
    Order create(Order order);
    Order update(Order order);
    void delete(Long id);
}
