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
    }

}
