package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static util.MyLogger.log;

/**
 * Bounded Queue V6_3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-22
 * @version 1.0
 */
public class BoundedQueueV6_3 implements BoundedQueue {

	private BlockingQueue<String> queue;

	public BoundedQueueV6_3(int max) {
		queue = new ArrayBlockingQueue<>(max);
	}

	@Override
	public void put(String data) {
		try {
			// 대기 시간 설정 가능
			boolean result = queue.offer(data, 1, TimeUnit.NANOSECONDS);
			log("저장 시도 결과 = " + result);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String take() {
		try {
			// 대기 시간 설정 가능
			return queue.poll(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String toString() {
		return queue.toString();
	}
}