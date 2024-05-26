package problem3.level2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 결제 처리 추상 클래스
 */
abstract class Payment2 {

    private String paymentDate;
    private String paymentMethod;
    private int paymentAmount;

    protected Payment2(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 결제 진행 (추상 메서드로 자식 클래스에서 구현해야 합니다.)
     * @param paymentAmount 결제 금액
     */
    public abstract void pay(int paymentAmount);

    /**
     * 영수증 출력
     */
    public final void printReceipt() {
        System.out.printf("\n[%s] %s - %,d원\n", paymentDate, paymentMethod, paymentAmount);
    }

    /**
     * 결제 정보 업데이트 (결제 금액과 결제 시간을 갱신)
     *
     * @param paymentAmount 결제 금액
     */
    protected final void updatePaymentInfo(int paymentAmount) {
        this.paymentAmount = paymentAmount;
        this.paymentDate = LocalDateTime.now()
                .format(DateTimeFormatter.ISO_DATE_TIME);
    }

}
