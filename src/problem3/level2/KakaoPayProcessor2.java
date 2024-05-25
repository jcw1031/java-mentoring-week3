package problem3.level2;

public class KakaoPayProcessor2 extends PaymentProcessor {

    public KakaoPayProcessor2() {
        super("카카오페이");
    }

    @Override
    public void pay(int paymentAmount) {
        System.out.printf("카카오페이로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentMetadata(paymentAmount);
    }

}
