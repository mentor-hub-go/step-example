package com.example.stepexample.entities;

import com.example.stepexample.entities.common.BaseEntity;
import com.example.stepexample.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Order extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private int totalPrice;

    private LocalDateTime registeredDateTime;

    @PrePersist
    protected void onCreate() {
        registeredDateTime = LocalDateTime.now();
    }

    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProducts;

}
