package thread.executor.reject;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

/**
 * Reject Main V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class RejectMainV2 {

	public static void main(String[] args) {

		ExecutorService executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS,
				new SynchronousQueue<>(), new ThreadPoolExecutor.DiscardPolicy());

		executor.submit(new RunnableTask("task1"));
		executor.submit(new RunnableTask("task2"));
		executor.submit(new RunnableTask("task3"));
		executor.close();
	}
}