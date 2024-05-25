package problem3.level2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 결제 처리 추상 클래스
 */
public abstract class PaymentProcessor {

    private String paymentDate;
    private String paymentMethod;
    private int paymentAmount;

    protected PaymentProcessor(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void pay(int paymentAmount);

    public final void printReceipt() {
        System.out.printf("\n[%s] %s - %,d원\n", paymentDate, paymentMethod, paymentAmount);
    }

    protected final void updatePaymentMetadata(int paymentAmount) {
        this.paymentAmount = paymentAmount;
        this.paymentDate = LocalDateTime.now()
                .format(DateTimeFormatter.ISO_DATE_TIME);
    }

}
