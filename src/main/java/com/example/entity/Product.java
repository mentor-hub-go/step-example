package com.example.entity;

import com.example.enums.ProductType;
import com.example.enums.SellingStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productNumber;

    //Product의 type, sellingStatus를 Enum 변경하고 String 저장되게 해주세요.
    // => enum 클래스에서 이를 받아와 선언하라는 것인가?
    @Enumerated(EnumType.STRING)
    private ProductType productType;

    //Product의 type, sellingStatus를 Enum 변경하고 String 저장되게 해주세요.
    @Enumerated(EnumType.STRING)
    private SellingStatus sellingStatus;

    private String name;

    private int price;

    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;









}
