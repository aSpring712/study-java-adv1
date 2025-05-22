package thread.bounded;

import static util.MyLogger.log;

/**
 * Producer Task
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-20
 * @version 1.0
 */
public class ProducerTask implements Runnable {

	private BoundedQueue queue;
	private String request;

	public ProducerTask(BoundedQueue queue, String request) {
		this.queue = queue;
		this.request = request;
	}

	@Override
	public void run() {
		log("[생산 시도] " + request + " -> " + queue);
		queue.put(request);
		log("[생산 완료] " + request + " -> " + queue);
	}
}