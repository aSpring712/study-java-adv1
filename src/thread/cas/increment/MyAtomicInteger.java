package thread.cas.increment;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * My Atomic Integer
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-23
 * @version 1.0
 */
public class MyAtomicInteger implements IncrementInteger {

	AtomicInteger atomicInteger = new AtomicInteger(0);

	@Override
	public void increment() {
		atomicInteger.incrementAndGet();
	}

	@Override
	public int get() {
		return atomicInteger.get();
	}
}