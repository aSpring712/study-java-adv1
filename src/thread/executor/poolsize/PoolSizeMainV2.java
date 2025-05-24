package thread.executor.poolsize;

import static thread.executor.ExecutorUtils.printState;
import thread.executor.RunnableTask;
import static util.MyLogger.log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Pool Size Main V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class PoolSizeMainV2 {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService es = Executors.newFixedThreadPool(2);
//		ExecutorService es = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
		log("pool 생성");
		printState(es);

		for (int i = 1; i <= 6; i++) {
			String taskName = "task" + i;
			es.execute(new RunnableTask(taskName));
			printState(es, taskName);
		}
		es.close();
		log("== shutdown 완료 ==");
	}
}