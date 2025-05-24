package thread.executor.poolsize;

import java.util.concurrent.*;
import static thread.executor.ExecutorUtils.printState;
import thread.executor.RunnableTask;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/**
 * Pool Size Main V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class PoolSizeMainV3 {

	public static void main(String[] args)  throws InterruptedException {
//		ExecutorService es = Executors.newCachedThreadPool();
//		keepAliveTime 60초 -> 3초로 조절
		ThreadPoolExecutor es = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 3, TimeUnit.SECONDS, new SynchronousQueue<>());
		log("pool 생성");
		printState(es);

		for (int i = 1; i <= 4; i++) {
			String taskName = "task" + i;
			es.execute(new RunnableTask(taskName));
			printState(es, taskName);
		}

		sleep(3000);
		log("== 작업 수행 완료 ==");
		printState(es);

		sleep(3000);
		log("== maximumPoolSize 대기 시간 초과 ==");
		printState(es);

		es.close();
		log("== shutdown 완료 ==");
		printState(es);
	}
}