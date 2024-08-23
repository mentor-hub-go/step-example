package com.example.stepexample.entity;

import com.example.stepexample.enums.ProductType;
import com.example.stepexample.enums.SellingStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productNumber;

    @Enumerated(EnumType.STRING)
    private ProductType type;

    @Enumerated(EnumType.STRING)
    private SellingStatus sellingStatus;

    @OneToMany(mappedBy = "product")
    private List<OrderProduct> orderProducts;

    private String name;

    private int price;


//    private LocalDateTime createdDateTime;
//    private LocalDateTime modifiedDateTime;
}
