package com.pragma.ecommerce.domain.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    public void testOrderCreation() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        Product product = new Product(1L, "Product 1", 10.0);
        Order order = new Order(1L, user, List.of(product), OrderStatus.CREATED);
        assertEquals(1L, order.getId());
        assertEquals(user, order.getUser());
        assertEquals(List.of(product), order.getProducts());
        assertEquals(OrderStatus.CREATED, order.getStatus());
    }
}