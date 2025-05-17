package util;

import static util.MyLogger.log;

/**
 * Thread Utils
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public abstract class ThreadUtils {

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			log("인터럽트 발생, " + e.getMessage());
			throw new RuntimeException(e);
		}
	}
}