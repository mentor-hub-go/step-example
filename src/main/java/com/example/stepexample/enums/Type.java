package com.example.stepexample.enums;

public enum Type {
    MANUFACTURED_BEVERAGE("제조 음료"),
    BOTTLED_BEVERAGE("병 음료"),
    BAKERY("베이커리");

    private final String type;

    Type(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
