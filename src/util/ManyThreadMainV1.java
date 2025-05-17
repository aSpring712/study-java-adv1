package util;

import thread.start.HelloRunnable;
import static util.MyLogger.*;

/**
 * Many Thread Main V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class ManyThreadMainV1 {

	public static void main(String[] args) {
		log("main() start");

		HelloRunnable runnable = new HelloRunnable();
		Thread thread1 = new Thread(runnable);
		thread1.start();
		Thread thread2 = new Thread(runnable);
		thread2.start();
		Thread thread3 = new Thread(runnable);
		thread3.start();

		log("main() end");
	}
}