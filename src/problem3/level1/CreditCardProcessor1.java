package problem3.level1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 신용카드 결제 처리 클래스
 */
public class CreditCardProcessor1 {

    private String paymentDate;
    private int paymentAmount;

    public void pay(int paymentAmount) {
        System.out.printf("신용카드로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentInfo(paymentAmount);
    }

    public void printReceipt() {
        System.out.printf("[%s] 신용카드 - %,d원\n", paymentDate, paymentAmount);
    }

    private void updatePaymentInfo(int paymentAmount) {
        this.paymentAmount = paymentAmount;
        // 아래 코드는 현재 시스템(컴퓨터)의 날짜와 시간을 가져와 문자열로 변환해 저장하는 역할을 한다는 것만 아시면 됩니다.
        this.paymentDate = LocalDateTime.now()
                .format(DateTimeFormatter.ISO_DATE_TIME);
    }

}
