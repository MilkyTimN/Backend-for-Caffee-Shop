package com.project.coffee.controller;

import com.project.coffee.model.Order;
import com.project.coffee.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/getOrders")
    public Set<Order> getOrders(){
        return orderService.getOrders();
    }
    @GetMapping("/getOrderById/{id}")
    public Order getById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }
    @PutMapping("/create")
    public Order create(@RequestBody Order order) {
        return orderService.create(order);
    }
    @PutMapping("/update")
    public Order update(@RequestBody Order order){
        return orderService.update(order);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        orderService.delete(id);
    }

}
