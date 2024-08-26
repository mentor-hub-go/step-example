package com.example.stepexample.entities.common;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {
    @CreatedDate
    private LocalDateTime createdDateTime ;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime ;


//    @PrePersist
//    protected void onCreate() {
//        LocalDateTime now = LocalDateTime.now();
//        this.createdDateTime = now ;
//        this.modifiedDateTime = now ;
//    }
//
//
//    @PreUpdate
//    protected void onUpdate() {
//        this.modifiedDateTime = LocalDateTime.now();
//    }


}