package com.example.enums;

import lombok.RequiredArgsConstructor;

// type은 제조 음료, 병 음료, 베이커리가 있고
@RequiredArgsConstructor
public enum ProductType {
    MANUFACTURED_DRINKS, // 제조 음료
    BOTTLED_DRINKS, // 병 음료
    BAKERIES // 베이커리
}
