package thread.start;

import static util.MyLogger.log;

/**
 * Inner Runnable Main V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class InnerRunnableMainV3 {

	public static void main(String[] args) {
		log("main() start");

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				log("run()");
			}
		});
		thread.start();

		log("main() end");
	}
}