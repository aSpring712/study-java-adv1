package util;

import thread.start.HelloRunnable;
import static util.MyLogger.log;

/**
 * Many Thread Main V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class ManyThreadMainV2 {

	public static void main(String[] args) {
		log("main() start");

		HelloRunnable runnable = new HelloRunnable();
		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
		}

		log("main() end");
	}
}