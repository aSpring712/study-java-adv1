package thread.cas.increment;

/**
 * Volatile Integer
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-23
 * @version 1.0
 */
public class VolatileInteger implements IncrementInteger {

	private volatile int value;

	@Override
	public void increment() {
		value++;
	}

	@Override
	public int get() {
		return value;
	}
}