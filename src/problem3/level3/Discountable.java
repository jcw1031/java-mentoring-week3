package problem3.level3;

/**
 * 할인 인터페이스
 */
interface Discountable {

    /**
     * 할인 적용 (추상 메서드로 자식 클래스에서 구현해야 합니다.)
     *
     * @param originalAmount 기존 결제 금액
     * @return 할인된 결제 금액
     */
    int discount(int originalAmount);

}
