package thread.executor.future;

import java.util.concurrent.*;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/**
 * Future Exception Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class FutureExceptionMain {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		log("작업 전달");
		Future<Integer> future = es.submit(new ExCallable());
		sleep(1000); // 잠시 대기

		try {
			log("future.get() 호출 시도, future.state(): " + future.state());
			Integer result = future.get();
			log("result value = " + result);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} catch (ExecutionException e) {
			log("e = " + e);
			Throwable cause = e.getCause(); // 원본 예외
			log("cause = " + cause);
		}

		es.close();
	}

	static class ExCallable implements Callable<Integer> {

		@Override
		public Integer call() {
			log("Callable 실행, 예외 발생");
			throw new IllegalStateException("ex!");
		}
	}
}