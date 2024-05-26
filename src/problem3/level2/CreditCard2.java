package problem3.level2;

class CreditCard2 extends Payment2 {

    public CreditCard2() {
        super("신용카드");
    }

    @Override
    public void pay(int paymentAmount) {
        System.out.printf("신용카드로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentInfo(paymentAmount);
    }

}
