package problem3.level1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 카카오페이 결제 처리 클래스
 */
public class KakaoPayProcessor1 {

    private String paymentDate;
    private int paymentAmount;

    public void pay(int paymentAmount) {
        // 지금은 단순 문자열을 출력하지만 복잡한 결제 로직이 있다고 가정합시다.
        System.out.printf("카카오페이로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentMetadata(paymentAmount);
    }

    public void printReceipt() {
        System.out.printf("[%s] 카카오페이 - %,d원\n", paymentDate, paymentAmount);
    }

    private void updatePaymentMetadata(int paymentAmount) {
        this.paymentAmount = paymentAmount;
        // 아래 코드는 현재 시스템(컴퓨터)의 날짜와 시간을 가져와 문자열로 변환해 저장하는 역할을 한다는 것만 아시면 됩니다.
        this.paymentDate = LocalDateTime.now()
                .format(DateTimeFormatter.ISO_DATE_TIME);
    }

}
