package com.example.stepexample;

public enum Type {
    INSTANCE_DRINK("제조음료"),
    BOTTLE_DRINK("병 음료"),
    BAKERY("베이커리");

    private String product;

    Type(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
}
