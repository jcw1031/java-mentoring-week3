package problem3.level3;

/**
 * 할인 인터페이스
 */
public interface Discountable {

    /**
     * 할인 적용
     * @param originalAmount 기존 결제 금액
     * @return 할인된 결제 금액
     */
    int discount(int originalAmount);

}
