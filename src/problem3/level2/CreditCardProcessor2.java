package problem3.level2;

public class CreditCardProcessor2 extends PaymentProcessor2 {

    public CreditCardProcessor2() {
        super("신용카드");
    }

    @Override
    public void pay(int paymentAmount) {
        System.out.printf("신용카드로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentInfo(paymentAmount);
    }

}
