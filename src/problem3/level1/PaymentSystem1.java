package problem3.level1;

import problem3.view.InputView;

/**
 * 결제 시스템
 */
public class PaymentSystem1 {

    public static void main(String[] args) {
        int paymentAmount = InputView.inputPaymentAmount(); // 결제 금액
        int paymentMethod = InputView.inputPaymentMethod(); // 결제 방식 (1-신용카드, 2-카카오페이, 3-네이버페이)

        // TODO 입력받은 결제 금액과 결제 방식을 통해 결제를 처리해봅시다! if문을 사용해도 좋고 switch 문을 사용해도 좋겠네요.
        switch (paymentMethod) {
            case 1: {
                CreditCardProcessor1 creditCardProcessor = new CreditCardProcessor1();
                creditCardProcessor.pay(paymentAmount);
                creditCardProcessor.printReceipt();
                break;
            }
            case 2: {
                KakaoPayProcessor1 kakaoPayProcessor = new KakaoPayProcessor1();
                kakaoPayProcessor.pay(paymentAmount);
                kakaoPayProcessor.printReceipt();
                break;
            }
            case 3: {
                NaverPayProcessor1 naverPayProcessor = new NaverPayProcessor1();
                naverPayProcessor.pay(paymentAmount);
                naverPayProcessor.printReceipt();
            }
        }
    }

}
