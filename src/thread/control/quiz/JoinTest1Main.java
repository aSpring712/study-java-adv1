package thread.control.quiz;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/**
 * Join Test1 Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class JoinTest1Main {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyTask(), "t1");
		Thread t2 = new Thread(new MyTask(), "t2");
		Thread t3 = new Thread(new MyTask(), "t3");

		t1.start();
		t1.join();

		t2.start();
		t2.join();

		t3.start();
		t3.join();
		System.out.println("모든 스레드 실행 완료");
	}

	static class MyTask implements Runnable {

		@Override
		public void run() {
			for (int i = 1; i <= 3; i++) {
				log(i);
				sleep(1000);
			}
		}
	}
}