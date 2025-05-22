package thread.bounded;

import static util.MyLogger.log;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Bounded Queue V6_4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-22
 * @version 1.0
 */
public class BoundedQueueV6_4 implements BoundedQueue {

	private BlockingQueue<String> queue;

	public BoundedQueueV6_4(int max) {
		queue = new ArrayBlockingQueue<>(max);
	}

	@Override
	public void put(String data) {
		queue.add(data); // java.lang.IllegalStateException: Queue full
	}

	@Override
	public String take() {
		return queue.remove(); // java.util.NoSuchElementException
	}

	@Override
	public String toString() {
		return queue.toString();
	}
}