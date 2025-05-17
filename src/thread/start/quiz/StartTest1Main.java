package thread.start.quiz;

import static util.MyLogger.log;

/**
 * Start Test1 Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class StartTest1Main {

	public static void main(String[] args) {
		CounterThread thread = new CounterThread();
		thread.start();
	}

	static class CounterThread extends Thread {

		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				log("value: " + i);
				try {
					Thread.sleep(1000); // 1초
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}