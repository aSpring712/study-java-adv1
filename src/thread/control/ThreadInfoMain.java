package thread.control;

import thread.start.HelloRunnable;
import static util.MyLogger.log;

/**
 * Thread Info Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class ThreadInfoMain {

	public static void main(String[] args) {
		// main 스레드
		Thread mainThread = Thread.currentThread();
		log("mainThread = " + mainThread);
		log("mainThread.threadId() = " + mainThread.threadId());
		log("mainThread.getName() = " + mainThread.getName());
		log("mainThread.getPriority() = " + mainThread.getPriority()); // 1~10 (기본값 5)
		log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
		log("mainThread.getState() = " + mainThread.getState());

		// myThread 스레드
		Thread myThread = new Thread(new HelloRunnable(), "myThread");
		log("myThread = " + myThread);
		log("myThread.threadId() = " + myThread.threadId());
		log("myThread.getName() = " + myThread.getName());
		log("myThread.getPriority() = " + myThread.getPriority()); // 1~10 (기본값 5)
		log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
		log("myThread.getState() = " + myThread.getState());
	}
}