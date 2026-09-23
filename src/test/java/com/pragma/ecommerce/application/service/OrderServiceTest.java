package com.pragma.ecommerce.application.service;

import com.pragma.ecommerce.domain.model.Order;
import com.pragma.ecommerce.domain.model.Product;
import com.pragma.ecommerce.domain.model.User;
import com.pragma.ecommerce.infrastructure.exception.OrderNotFoundException;
import com.pragma.ecommerce.infrastructure.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@SpringBootTest
public class OrderServiceTest {
    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateOrder() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        Product product = new Product(1L, "Product 1", 10.0);
        Order order = new Order(null, user, List.of(product), OrderStatus.CREATED);
        when(orderRepository.save(order)).thenReturn(order);
        Order createdOrder = orderService.createOrder(user, List.of(product));
        assertEquals(order, createdOrder);
    }

    @Test
    public void testGetOrder() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        Product product = new Product(1L, "Product 1", 10.0);
        Order order = new Order(1L, user, List.of(product), OrderStatus.CREATED);
        when(orderRepository.findById(1L)).thenReturn(java.util.Optional.of(order));
        Order retrievedOrder = orderService.getOrder(1L);
        assertEquals(order, retrievedOrder);
    }

    @Test
    public void testGetOrderNotFound() {
        when(orderRepository.findById(1L)).thenReturn(java.util.Optional.empty());
        assertThrows(OrderNotFoundException.class, () -> orderService.getOrder(1L));
    }
}