package thread.executor.reject;

import thread.executor.RunnableTask;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static util.MyLogger.log;

/**
 * Reject Main V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class RejectMainV4 {

	public static void main(String[] args) {

		ExecutorService executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS,
				new SynchronousQueue<>(), new MyRejectedExecutionHandler());

		executor.submit(new RunnableTask("task1"));
		executor.submit(new RunnableTask("task2"));
		executor.submit(new RunnableTask("task3"));
		executor.close();
	}

	static class MyRejectedExecutionHandler implements RejectedExecutionHandler {

		static AtomicInteger count = new AtomicInteger(0);

		@Override
		public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
			int i = count.incrementAndGet();
			log("[경고] 거절된 누적 작업 수: " + i);
		}
	}
}