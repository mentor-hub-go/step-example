package com.example.entity;

import com.example.enums.OrderStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Order의 orderStatus를 Enum 변경하고 String 저장되게 해주세요.
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private int totalPrice;

    // Order 에서 Order 에 연관된 orderProduct 를 들 고 올 수 있는 필드 추가?
    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProducts;

    private LocalDateTime registeredDateTime;

    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;



}
