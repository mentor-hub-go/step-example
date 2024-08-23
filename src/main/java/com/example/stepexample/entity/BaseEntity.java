package com.example.stepexample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity{
    @Column(updatable = false)
    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;

    @PrePersist
    public void prePersist(){
        LocalDateTime now = LocalDateTime.now();
        createdDateTime = now;
        modifiedDateTime = now;
    }
    @PreUpdate
    public void preUpdate() {
        modifiedDateTime = LocalDateTime.now();
    }
}
