package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * My Logger
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public abstract class MyLogger {

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	public static void log(Object obj) {
		String time = LocalTime.now().format(formatter);
		System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
	}
}