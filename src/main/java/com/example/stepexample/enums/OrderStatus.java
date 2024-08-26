package com.example.stepexample.enums;

public enum OrderStatus {
    ORDER_CREATED("주문생성"),
    ORDER_CANCELLED("주문취소"),
    ORDER_COMPLETED("주문완료");

    private String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
