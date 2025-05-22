package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Bounded Queue V6_1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-22
 * @version 1.0
 */
public class BoundedQueueV6_1 implements BoundedQueue {

	private BlockingQueue<String> queue;

	public BoundedQueueV6_1(int max) {
		queue = new ArrayBlockingQueue<>(max);
	}

	@Override
	public void put(String data) {
		try {
			queue.put(data);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String take() {
		try {
			return queue.take();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String toString() {
		return queue.toString();
	}
}