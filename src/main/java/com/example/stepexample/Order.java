package com.example.stepexample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProduct;
    private OrderStatus orderStatus;

    private int totalPrice;

    private LocalDateTime registeredDateTime;

    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;

    void cancel() {
        orderStatus = OrderStatus.CANCLE_ORDER;
        System.out.println(orderStatus.name());
    }

    void create() {
        orderStatus = OrderStatus.CREATE_ORDER;
        System.out.println(orderStatus.name());
    }

    void clear() {
        orderStatus = OrderStatus.CLEAR;
        System.out.println(orderStatus.name());
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.create();
        order.cancel();
        order.clear();
    }
}
