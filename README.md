# 단계별 실습 예제

### 해당 레포지터리는 단계별로 진행되는 예제 입니다.

### 진행방법

풀리퀘스트 방식으로 진행 됩니다.   
feature-{email}(ex. feature-sunghyun) 본인의 브랜치로 pull을 받습니다.
각 단계 마다 도전할 시 feature-{email]-{단계}(ex. feature-sunghyun-1) 브랜치를 생성 합니다.   
하실 수 있는 것 까지 진행하시고 feature-{email} 풀리퀘스트를 생성하고 저를 리뷰어로 지정해주세요.

## 1단계 
Order, OrderProduct, Product Entity를 생성 합니다.   

#### 요구사항

##### Order
1. Order의 orderStatus를 Enum 변경하고 String 저장되게 해주세요.
2. orderStatus는 주문생성, 주문취소, 처리완료가 있습니다.
3. Order에서 Order에 연관된 orderProduct를 들고 올 수 있는 필드를 추가 해주세요.

##### Product
1. Product의 type, sellingStatus를 Enum 변경하고 String 저장되게 해주세요.
2. type은 제조 음료, 병 음료, 베이커리가 있고, sellingStatus는 판매중, 판매보류, 판매중지가 있습니다.

##### orderProduct
1. 고유 id와 Order와 Product를 이어주는 N:M Entity로 설정 해주세요

##### 공통
1. 모든 Entity에는 createdDateTime 생성 일시, modifiedDateTime 수정 일시가 있습니다.
2. 해당 필드들을 공통화 하는 추상 클래스를 만들고 Entity가 생성, 수정 될 때 자동적으로 현재 시간을 입력하게 설정해주세요.
