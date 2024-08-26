package com.example.stepexample.entities;

import com.example.stepexample.entities.common.BaseEntity;
import com.example.stepexample.enums.SellingStatus;
import com.example.stepexample.enums.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productNumber;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private SellingStatus sellingStatus;

    private String name;
    private int price;

    @OneToMany(mappedBy = "product")
    private List<OrderProduct> orderProducts;
}
