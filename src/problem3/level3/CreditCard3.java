package problem3.level3;

class CreditCard3 extends Payment3 {

    public CreditCard3() {
        super("신용카드");
    }

    @Override
    public void pay(int paymentAmount) {
        System.out.printf("신용카드로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentInfo(paymentAmount);
    }

}
