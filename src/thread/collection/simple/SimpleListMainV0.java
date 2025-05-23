package thread.collection.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple List Main V0
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-23
 * @version 1.0
 */
public class SimpleListMainV0 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// 스레드1, 스레드2가 동시에 실행 가정
		list.add("A"); // 스레드1 실행 가정
		list.add("B"); // 스레드2 실행 가정
		System.out.println(list);
	}
}