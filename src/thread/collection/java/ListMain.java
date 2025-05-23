package thread.collection.java;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * List Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-23
 * @version 1.0
 */
public class ListMain {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("list = " + list);
	}
}