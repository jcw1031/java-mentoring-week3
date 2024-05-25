## 간단한 결제 시스템 개발하기 - LEVEL 1

`CreditCardProcessor1`, `KakaoPayProcessor1`, `NaverPayProcessor1`는 구현되어 있습니다.  
각 클래스의 멤버 변수(필드)와 메서드를 살펴보고 어떤 기능이 있는지 확인해 보세요!

#### 멤버 변수

- `int paymentAmount`: 결제 금액
- `String paymentDate`: 결제 날짜•시간

#### 메서드

- `void pay(int paymentAmount)`: 결제
- `void printReceipt()`: 결제 영수증 출력
- `void updatePaymentMetadata(int paymentAmount)`: 결제 정보 업데이트 (결제 금액과 결제 시간을 갱신)

### 과제

**이제 아래의 출력 예제를 보고 `PaymentSystem1`의 `main` 메서드를 완성하세요!**

![level1-result.png](../resources/level1-result.png)
