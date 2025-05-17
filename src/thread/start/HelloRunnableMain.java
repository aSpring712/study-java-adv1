package thread.start;

/**
 * Hello Runnable Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class HelloRunnableMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": main()");

		HelloRunnable runnable = new HelloRunnable();
		Thread thread = new Thread(runnable);
		thread.start();

		System.out.println(Thread.currentThread().getName() + ": main() end");
	}
}