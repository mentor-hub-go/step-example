package com.example.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 고유 id와 Order와 Product를 이어주는 N:M Entity로 설정 해주세요
    @ManyToMany
    @JoinColumn(name = "order_id", nullable = false) // 외래키 설정?
    private Order order;

    @ManyToMany
    @JoinColumn(name = "product_id", nullable = false) // 외래키 설정?
    private Product product;

    public OrderProduct(Order order, Product product) {
        this.order = order;
        this.product = product;
    }




}
