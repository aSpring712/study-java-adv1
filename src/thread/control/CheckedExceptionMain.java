package thread.control;

/**
 * Checked Exception Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-17
 * @version 1.0
 */
public class CheckedExceptionMain {

	public static void main(String[] args) throws Exception {
		throw new Exception();
	}

	static class CheckedRunnable implements Runnable {

		@Override
		public void run() /* throws Exception */ { // 주석 풀면 예외 발생
//			throw new Exception(); // 주석 풀면 예외 발생
		}
	}
}