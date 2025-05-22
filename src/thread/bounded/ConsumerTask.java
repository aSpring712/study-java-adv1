package thread.bounded;

import static util.MyLogger.log;

/**
 * Consumer Task
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-20
 * @version 1.0
 */
public class ConsumerTask implements Runnable {

	private BoundedQueue queue;

	public ConsumerTask(BoundedQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		log("[소비 시도]		? <- " + queue);
		String data = queue.take();
		log("[소비 완료] " + data + " <- " + queue);
	}
}