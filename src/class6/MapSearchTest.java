package class6;

import java.util.HashMap;
import java.util.Map;

public class MapSearchTest {

	public static void main(String[] args) {
		Map<Integer, String> numberString = new HashMap<Integer, String>();
		int max = 100000000;
		for (int i = 0; i < max; i++) {
			numberString.put(i, "Siva" + i);
		}
		long start = System.nanoTime();
		System.out.println(numberString.get(max - 1));
		long end = System.nanoTime();
		System.out.println("Time for search -> " + (end - start));
	}

}
