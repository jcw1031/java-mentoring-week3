package problem3.view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * console을 통해 사용자의 입력을 처리합니다.<br>
 * 문제를 푸실 때 사용자 입력을 받는다는 것만 인지하고 내부 구현은 크게 신경쓰지 않아도 됩니다.<br>
 */
public class InputView {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] paymentMethods = {"신용카드", "카카오페이", "네이버페이"};

    /**
     * 결제 금액을 입력받습니다.<br>
     * [검증] 100원 이상인지, 100원 단위인지
     *
     * @return 사용자가 입력한 결제 금액
     */
    public static int inputPaymentAmount() {
        System.out.println("결제 금액을 입력하세요. (결제 금액은 100원 이상이어야 하고, 100원 단위로 입력해야 합니다. [e.g. 1,100원은 가능하지만 1,010원은 불가능])");
        do {
            System.out.print("결제 금액: ");
            int input = scanner.nextInt();
            if (input < 100 || input % 100 != 0) {
                System.out.println("[ERROR] 잘못된 값입니다! 다시 입력해주세요.");
                continue;
            }
            System.out.printf("결제 금액 %,d원을 입력했습니다.\n\n", input);
            return input;
        } while (true);
    }

    /**
     * 결제 방식을 입력받습니다.<br>
     * [검증] 1 ~ 3 사이 값으로 선택했는지
     *
     * @return 사용자가 선택한 결제 방식
     */
    public static int inputPaymentMethod() throws InputMismatchException {
        do {
            System.out.println("결제 방식을 선택하세요.");
            for (int i = 0; i < paymentMethods.length; i++) {
                System.out.printf("%d-%s   ", i + 1, paymentMethods[i]);
            }

            System.out.print("\n결제 방식: ");
            int input = scanner.nextInt();
            if (input < 1 || input > paymentMethods.length + 1) {
                System.out.println("[ERROR] 잘못된 값입니다! 다시 선택해주세요.");
                continue;
            }

            return input;
        } while (true);
    }
}
