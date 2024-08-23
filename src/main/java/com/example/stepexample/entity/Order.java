package com.example.stepexample.entity;

import com.example.stepexample.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private int totalPrice;

    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProducts;


    private LocalDateTime registeredDateTime;

//    private LocalDateTime createdDateTime;
//    private LocalDateTime modifiedDateTime;
}
