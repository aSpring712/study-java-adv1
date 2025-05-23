package thread.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Synchronized List Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-23
 * @version 1.0
 */
public class SynchronizedListMain {

	public static void main(String[] args) {
		List<String> list = Collections.synchronizedList(new ArrayList<>());
		list.add("data1");
		list.add("data2");
		list.add("data3");
		System.out.println(list.getClass());
		System.out.println("list = " + list);
	}
}