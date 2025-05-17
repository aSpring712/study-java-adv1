package thread.start;

import static util.MyLogger.log;

/**
 * Inner Runnable Main V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class InnerRunnableMainV2 {

	public static void main(String[] args) {
		log("main() start");

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				log("run()");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

		log("main() end");
	}
}