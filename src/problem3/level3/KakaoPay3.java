package problem3.level3;

class KakaoPay3 extends Payment3 implements Discountable {

    public KakaoPay3() {
        super("카카오페이");
    }

    @Override
    public void pay(int paymentAmount) {
        System.out.printf("카카오페이로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentInfo(paymentAmount);
    }

    @Override
    public int discount(int originalAmount) {
        System.out.println("10% 할인이 적용됩니다.");
        int discountedPaymentAmount = (int) (originalAmount * 0.9);
        System.out.printf("할인 결제 금액은 %,d원입니다.\n", discountedPaymentAmount);
        return discountedPaymentAmount;
    }

}
