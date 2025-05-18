package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/**
 * Volatile Count Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-18
 * @version 1.0
 */
public class VolatileCountMain {

	public static void main(String[] args) {
		MyTask task = new MyTask();
		Thread t = new Thread(task, "work");
		t.start();
		sleep(1000);
		task.flag = false;
		log("flag = " + task.flag + ", count = " + task.count + " in main");
	}

	static class MyTask implements Runnable {
//		boolean flag = true;
//		long count;
		volatile boolean flag = true;
		volatile long count;

		@Override
		public void run() {
			while (flag) {
				count++;
				// 1억번에 한번씩 출력
				if (count % 100_000_000 == 0) {
					// 주석 처리 한다면...
					log("flag = " + flag + ", count = " + count + " in while()");
				}
			}
			log("flag = " + flag + ", count = " + count + " 종료");
		}
	}
}