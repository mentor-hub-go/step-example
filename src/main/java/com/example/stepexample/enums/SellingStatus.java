package com.example.stepexample.enums;

public enum SellingStatus {
    SELLING("판매중"),
    HOLD("판매보류"),
    STOP("판매중지");

    private String status;

    SellingStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
