package thread.bounded;

/**
 * Bounded Queue
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-20
 * @version 1.0
 */
public interface BoundedQueue {
	void put(String data);

	String take();
}