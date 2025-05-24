package thread.executor.future;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Callable Main V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class CallableMainV1 {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future<Integer> future = es.submit(new MyCallable());
		Integer result = future.get();
		log("result value = " + result);
		es.close();
	}

	static class MyCallable implements Callable<Integer> {

		@Override
		public Integer call() {
			log("Callable 시작");
			sleep(2000);
			int value = new Random().nextInt(10);
			log("create value = " + value);
			log("Callable 완료");
			return value;
		}
	}
}