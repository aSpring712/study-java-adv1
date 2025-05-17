package thread.start;

/**
 * Daemon Thread Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class DaemonThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": main() start");
		DaemonThread daemonThread = new DaemonThread();
		daemonThread.setDaemon(false); // 데몬 스레드 여부
		daemonThread.start();
		System.out.println(Thread.currentThread().getName() + ": main() end");
	}

	static class DaemonThread extends Thread {

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + ": run() start");

			try {
				Thread.sleep(10000); // 10초간 실행
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println(Thread.currentThread().getName() + ": run() end");
		}
	}
}