package thread.start;

/**
 * Bad Thread Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class BadThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": main() start");

		HelloThread helloThread = new HelloThread();
		System.out.println(Thread.currentThread().getName() + ": run() 호출 전");
		helloThread.run();
		System.out.println(Thread.currentThread().getName() + ": run() 호출 후");

		System.out.println(Thread.currentThread().getName() + ": main() end");
	}
}