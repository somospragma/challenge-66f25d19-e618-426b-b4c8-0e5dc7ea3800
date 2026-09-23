package com.pragma.ecommerce.domain.model;

import java.util.List;

public class Order {
    private Long id;
    private User user;
    private List<Product> products;
    private OrderStatus status;

    public Order(Long id, User user, List<Product> products, OrderStatus status) {
        this.id = id;
        this.user = user;
        this.products = products;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}