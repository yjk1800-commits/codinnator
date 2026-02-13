public class OrderService_e {

    /**
     * 주문 금액에 따른 최종 결제 금액을 계산합니다.
     * 로직: 10,000원 이상 구매 시 10% 할인
     */
    public long calculateFinalPrice(long totalAmount) {
        if (totalAmount >= 10000) {
            long discount = totalAmount / 10; // 10% 할인액 계산

            // 최종 결제 금액(total), 주문 금액(totalAmount), 할인액(discount)
            // 주문 금액 범위: 0 ~ 3000000000L
            // 주문 금액: 3000000000L, 할인액: 300000000L, (기대값)최종 결제 금액: 2700000000L
            long total = totalAmount - discount;

            return total;
        }
        
        return totalAmount;
    }
}