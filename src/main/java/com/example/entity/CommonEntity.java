package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

// 모든 Entity에는 createdDateTime 생성 일시, modifiedDateTime 수정 일시가 있습니다.
// => 공통 엔터티 클래스를 만들어서 공통된 기능은 여기에 구현
@MappedSuperclass
public abstract class CommonEntity {
    @Column(updatable = false)
    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;

    //해당 필드들을 공통화 하는 추상 클래스를 만들고 Entity가 생성,
    // 수정 될 때 자동적으로 현재 시간을 입력하게 설정해주세요.


}
