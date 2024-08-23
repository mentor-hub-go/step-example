package com.example.stepexample.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class OrderProduct extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false) // 외래키
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

//    private LocalDateTime createdDateTime;
//    private LocalDateTime modifiedDateTime;

    public OrderProduct(Order order, Product product) {
        this.order = order;
        this.product = product;
    }
}
