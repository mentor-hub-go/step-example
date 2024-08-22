package com.example.stepexample;

public enum OrderStatus {
    CREATE_ORDER("주문생성"),
    CANCLE_ORDER("주문취소"),
    CLEAR("처리완료");

    private String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
