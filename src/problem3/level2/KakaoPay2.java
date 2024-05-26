package problem3.level2;

class KakaoPay2 extends Payment2 {

    public KakaoPay2() {
        super("카카오페이");
    }

    @Override
    public void pay(int paymentAmount) {
        System.out.printf("카카오페이로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentInfo(paymentAmount);
    }

}
