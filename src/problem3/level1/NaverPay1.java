package problem3.level1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 네이버페이 결제 처리 클래스
 */
class NaverPay1 {

    private String paymentDate;
    private int paymentAmount;

    /**
     * 결제 진행
     *
     * @param paymentAmount 결제 금액
     */
    public void pay(int paymentAmount) {
        System.out.printf("네이버페이로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentInfo(paymentAmount);
    }

    /**
     * 영수증 출력
     */
    public void printReceipt() {
        System.out.printf("[%s] 네이버페이 - %,d원\n", paymentDate, paymentAmount);
    }

    /**
     * 결제 정보 업데이트 (결제 금액과 결제 시간을 갱신)
     *
     * @param paymentAmount 결제 금액
     */
    private void updatePaymentInfo(int paymentAmount) {
        this.paymentAmount = paymentAmount;
        // 아래 코드는 현재 시스템(컴퓨터)의 날짜와 시간을 가져와 문자열로 변환해 저장하는 역할을 한다는 것만 아시면 됩니다.
        this.paymentDate = LocalDateTime.now()
                .format(DateTimeFormatter.ISO_DATE_TIME);
    }

}
