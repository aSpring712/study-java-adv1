package thread.executor;

import static util.MyLogger.log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Executor Utils
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class ExecutorUtils {

	public static void printState(ExecutorService executorService) {
		if (executorService instanceof ThreadPoolExecutor poolExecutor) {
			int pool = poolExecutor.getPoolSize();
			int active = poolExecutor.getActiveCount();
			int queuedTasks = poolExecutor.getQueue().size();
			long completedTask = poolExecutor.getCompletedTaskCount();
			log("[pool=" + pool + ", active=" + active +", queuedTasks=" + queuedTasks + ", completedTasks=" + completedTask + "]");
		} else {
			log(executorService);
		}
	}
}