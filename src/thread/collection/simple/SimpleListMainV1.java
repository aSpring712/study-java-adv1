package thread.collection.simple;

import thread.collection.simple.list.BasicList;
import thread.collection.simple.list.SimpleList;

/**
 * Simple List Main V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-23
 * @version 1.0
 */
public class SimpleListMainV1 {

	public static void main(String[] args) {
		SimpleList list = new BasicList();
		list.add("A");
		list.add("B");
		System.out.println("list = " + list);
	}
}