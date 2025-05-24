package thread.executor.quiz;

/**
 * Old Order Service Test Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class OldOrderServiceTestMain {

	public static void main(String[] args) {
		String orderNo = "Order#1234"; // 예시 주문 번호
		OldOrderService orderService = new OldOrderService();
		orderService.order(orderNo);
	}
}