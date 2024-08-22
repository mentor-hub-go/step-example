package com.example.stepexample;

public enum SellingStatus {
    SELLING("판매중"),
    SELLING_HOLD("판매보류"),
    SELLING_CANCEL("판매취소");

    private String sellingStatus;

    SellingStatus(String sellingStatus) {
        this.sellingStatus = sellingStatus;
    }

    public String getSellingStatus() {
        return sellingStatus;
    }
}
