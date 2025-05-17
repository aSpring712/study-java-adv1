package thread.start.quiz;

import static util.MyLogger.log;

/**
 * Start Test3 Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class StartTest3Main {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					log("value: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
			}
		};

		Thread thread = new Thread(runnable, "counter");
		thread.start();
	}
}