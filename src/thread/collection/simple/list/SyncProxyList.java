package thread.collection.simple.list;

/**
 * Sync Proxy List
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-23
 * @version 1.0
 */
public class SyncProxyList implements SimpleList {

	private SimpleList target;

	public SyncProxyList(SimpleList target) {
		this.target = target;
	}

	@Override
	public synchronized void add(Object e) {
		target.add(e);
	}

	@Override
	public Object get(int index) {
		return target.get(index);
	}

	@Override
	public synchronized int size() {
		return target.size();
	}

	@Override
	public synchronized String toString() {
		return target.toString() + " by " + this.getClass().getSimpleName();
	}
}