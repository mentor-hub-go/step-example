package com.example.stepexample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Product{
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "product")
    private List<OrderProduct> orderProductList;

    private String productNumber;

    private Type type;

    private SellingStatus sellingStatus;

    private String name;

    private int price;

    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;
}
