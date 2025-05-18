package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/**
 * Thread Stop Main V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-18
 * @version 1.0
 */
public class ThreadStopMainV3 {

	public static void main(String[] args) {
		MyTask task = new MyTask();
		Thread thread = new Thread(task, "work");
		thread.start();

		sleep(100); // 시간을 줄임
		log("작업 중단 지시 - thread.interrupt()");
		thread.interrupt();
		log("work 스레드 인터럽트 상태1 = " + thread.isInterrupted()); // true
	}

	static class MyTask implements Runnable {

		@Override
		public void run() {
			while (!Thread.currentThread().isInterrupted()) {
				log("작업 중");
			}
			log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted()); // true

			try {
				log("자원 정리 시도");
				Thread.sleep(1000);
				log("자원 정리 완료");
			} catch (InterruptedException e) {
				log("자원 정리 실패 - 자원 정리 중 인터럽트 발생");
				log("work 스레드 인터럽트 상태3 = " + Thread.currentThread().isInterrupted()); // false
			}
			log("작업 종료");
		}
	}
}