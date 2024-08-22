package com.example.stepexample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
@Entity
public class OrderProduct {
   @Id
   @GeneratedValue
    private Long id;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Product product;

    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;

    public OrderProduct(Order order, Product product) {
        this.order = order;
        this.product = product;
    }

    public OrderProduct() {

    }
}
