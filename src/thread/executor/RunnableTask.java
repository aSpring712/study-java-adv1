package thread.executor;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/**
 * Runnable Task
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class RunnableTask implements Runnable {

	private final String name;
	private int sleepMs = 1000; // 2초

	public RunnableTask(String name) {
		this.name = name;
	}

	public RunnableTask(String name, int sleepMs) {
		this.name = name;
		this.sleepMs = sleepMs;
	}

	@Override
	public void run() {
		log(name +" 시작");
		sleep(sleepMs); // 작업 시간 시뮬레이션
		log(name +" 완료");
	}
}