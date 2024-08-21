package com.example.stepexample;

import java.time.LocalDateTime;

public class OrderProduct {

    private Long id;

    private Order order;

    private Product product;

    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;

    public OrderProduct(Order order, Product product) {
        this.order = order;
        this.product = product;
    }
}
