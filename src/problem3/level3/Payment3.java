package problem3.level3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 결제 처리 추상 클래스
 */
abstract class Payment3 {

    private String paymentDate;
    private String paymentMethod;
    private int paymentAmount;

    protected Payment3(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void pay(int paymentAmount);

    public final void printReceipt() {
        System.out.printf("\n[%s] %s - %,d원\n", paymentDate, paymentMethod, paymentAmount);
    }

    protected final void updatePaymentInfo(int paymentAmount) {
        this.paymentAmount = paymentAmount;
        this.paymentDate = LocalDateTime.now()
                .format(DateTimeFormatter.ISO_DATE_TIME);
    }

}
