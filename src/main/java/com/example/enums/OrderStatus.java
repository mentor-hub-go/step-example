package com.example.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OrderStatus {
    // orderStatus는 주문생성, 주문취소, 처리완료가 있습니다.
    ORDER_CREATE,
    ORDER_CANCEL,
    ORDER_COMPLETE
}
