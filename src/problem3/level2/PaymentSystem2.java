package problem3.level2;

import problem3.view.InputView;

/**
 * 결제 시스템
 */
public class PaymentSystem2 {

    public static void main(String[] args) {
        int paymentAmount = InputView.inputPaymentAmount();
        int paymentMethod = InputView.inputPaymentMethod();

        PaymentProcessor paymentProcessor = null;
        switch (paymentMethod) {
            case 1: {
                paymentProcessor = new CreditCardProcessor2();
                break;
            }
            case 2: {
                paymentProcessor = new KakaoPayProcessor2();
                break;
            }
            case 3: {
                paymentProcessor = new NaverPayProcessor2();
            }
        }

        paymentProcessor.pay(paymentAmount);
        paymentProcessor.printReceipt();

        /*
         * LEVEL1의 코드와 비교했을 때
         */
    }

}
