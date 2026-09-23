package com.pragma.ecommerce.application.service;

import com.pragma.ecommerce.domain.model.Order;
import com.pragma.ecommerce.domain.model.Product;
import com.pragma.ecommerce.domain.model.User;
import com.pragma.ecommerce.infrastructure.exception.OrderNotFoundException;
import com.pragma.ecommerce.infrastructure.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(User user, List<Product> products) {
        Order order = new Order(null, user, products, OrderStatus.CREATED);
        return orderRepository.save(order);
    }

    public Order getOrder(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException("Order not found"));
    }

    public void cancelOrder(Long id) {
        Order order = getOrder(id);
        order.setStatus(OrderStatus.CANCELLED);
        orderRepository.save(order);
    }
}