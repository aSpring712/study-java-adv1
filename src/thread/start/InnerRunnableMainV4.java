package thread.start;

import static util.MyLogger.log;

/**
 * Inner Runnable Main V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class InnerRunnableMainV4 {

	public static void main(String[] args) {
		log("main() start");

		// 람다를 배우면 이해
		Thread thread = new Thread(() -> log("run()"));
		thread.start();

		log("main() end");
	}
}