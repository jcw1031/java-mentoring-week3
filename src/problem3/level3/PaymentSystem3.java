package problem3.level3;

import problem3.view.InputView;

/**
 * 결제 시스템
 */
public class PaymentSystem3 {

    public static void main(String[] args) {
        int paymentAmount = InputView.inputPaymentAmount();
        int paymentMethod = InputView.inputPaymentMethod();

        PaymentProcessor paymentProcessor = null;
        switch (paymentMethod) {
            case 1: {
                paymentProcessor = new CreditCardProcessor();
                break;
            }
            case 2: {
                paymentProcessor = new KakaoPayProcessor();
                break;
            }
            case 3: {
                paymentProcessor = new NaverPayProcessor();
            }
        }

        // 할인이 적용되는 결제인 경우 할인
        if (paymentProcessor instanceof Discountable) {
            paymentAmount = ((Discountable) paymentProcessor).discount(paymentAmount);
        }

        paymentProcessor.pay(paymentAmount);
        paymentProcessor.printReceipt();

        /*
         * 만약 다형성을 활용하지 않으면 코드가 얼마나 길고 지저분해질까요?
         * 객체지향 다형성의 장점을 인지하고 잘 활용한다면 좋은 코드를 작성할 수 있습니다!
         */
    }
}
