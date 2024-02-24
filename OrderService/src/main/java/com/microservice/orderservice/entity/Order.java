package com.microservice.orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;

    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "ORDER_DATE")
    private Instant orderDate;

    @Column(name = "TOTAL_AMOUNT")
    private long amount;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public Instant getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Instant orderDate) {
        this.orderDate = orderDate;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
