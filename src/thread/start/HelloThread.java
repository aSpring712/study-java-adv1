package thread.start;

/**
 * Hello Thread
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class HelloThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": run()");
	}
}