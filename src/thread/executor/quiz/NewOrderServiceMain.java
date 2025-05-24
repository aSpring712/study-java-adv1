package thread.executor.quiz;

import java.util.concurrent.ExecutionException;

/**
 * New Order Service Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class NewOrderServiceMain {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		String orderNo = "Order#1234";
		NewOrderService orderService = new NewOrderService();
		orderService.order(orderNo);
	}
}