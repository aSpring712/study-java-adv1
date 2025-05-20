package thread.sync.quiz;

import static util.MyLogger.log;

/**
 * Sync Test2 Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-20
 * @version 1.0
 */
public class SyncTest2Main {

	public static void main(String[] args) throws InterruptedException {
		MyCounter myCounter = new MyCounter();

		Runnable task = new Runnable() {
			@Override
			public void run() {
				myCounter.count();
			}
		};

		Thread thread1 = new Thread(task, "Thread-1");
		Thread thread2 = new Thread(task, "Thread-2");

		thread1.start();
		thread2.start();
	}

	static class MyCounter {

		public void count() {
			int localValue = 0;
			for (int i = 0; i < 1000; i++) {
				localValue = localValue + 1;
			}
			log("결과: " + localValue);
		}
	}
}