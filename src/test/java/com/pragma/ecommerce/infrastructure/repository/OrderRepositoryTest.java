package com.pragma.ecommerce.infrastructure.repository;

import com.pragma.ecommerce.domain.model.Order;
import com.pragma.ecommerce.domain.model.Product;
import com.pragma.ecommerce.domain.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class OrderRepositoryTest {
    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveOrder() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        Product product = new Product(1L, "Product 1", 10.0);
        Order order = new Order(null, user, List.of(product), OrderStatus.CREATED);
        when(orderRepository.save(order)).thenReturn(order);
        Order savedOrder = orderRepository.save(order);
        assertEquals(order, savedOrder);
    }

    @Test
    public void testFindOrderById() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        Product product = new Product(1L, "Product 1", 10.0);
        Order order = new Order(1L, user, List.of(product), OrderStatus.CREATED);
        when(orderRepository.findById(1L)).thenReturn(Optional.of(order));
        Order retrievedOrder = orderRepository.findById(1L).orElse(null);
        assertEquals(order, retrievedOrder);
    }
}