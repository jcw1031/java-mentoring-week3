package problem3.level3;

class NaverPay3 extends Payment3 implements Discountable {

    public NaverPay3() {
        super("네이버페이");
    }

    @Override
    public void pay(int paymentAmount) {
        System.out.printf("네이버페이로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentInfo(paymentAmount);
    }

    @Override
    public int discount(int originalAmount) {
        System.out.println("5% 할인이 적용됩니다.");
        int discountedPaymentAmount = (int) (originalAmount * 0.95);
        System.out.printf("할인된 결제 금액은 %,d원입니다.\n", discountedPaymentAmount);
        return discountedPaymentAmount;
    }

}
