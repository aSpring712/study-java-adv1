package thread.executor.future;

import java.util.List;
import java.util.concurrent.*;

import thread.executor.CallableTask;
import static util.MyLogger.log;

/**
 * Invoke All Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class InvokeAllMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(10);

		CallableTask task1 = new CallableTask("task1", 1000);
		CallableTask task2 = new CallableTask("task2", 2000);
		CallableTask task3 = new CallableTask("task3", 3000);
		List<CallableTask> tasks = List.of(task1, task2, task3);

		List<Future<Integer>> futures = es.invokeAll(tasks);
		for (Future<Integer> future : futures) {
			Integer value = future.get();
			log("value = " + value);
		}
		es.close();
	}
}