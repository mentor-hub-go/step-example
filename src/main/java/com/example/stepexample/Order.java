package com.example.stepexample;

import com.example.stepexample.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Long id;

    private OrderStatus orderStatus;

    private int totalPrice;

    private LocalDateTime registeredDateTime;
    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;


}
