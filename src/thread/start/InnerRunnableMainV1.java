package thread.start;

import static util.MyLogger.log;

/**
 * Inner Runnable Main V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class InnerRunnableMainV1 {

	public static void main(String[] args) {
		log("main() start");

		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();

		log("main() end");
	}

	static class MyRunnable implements Runnable {
		@Override
		public void run() {
			log("run()");
		}
	}
}