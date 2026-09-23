package com.pragma.ecommerce.infrastructure.repository;

import com.pragma.ecommerce.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}