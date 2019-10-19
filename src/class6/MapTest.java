package class6;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> names = new HashMap<String, String>();
		names.put("Siva", "Kumar");
		names.put("Kei", "Tian");
		names.put("Steven", "Wang");

		System.out.println(names);

		Map<String, Student> map = new HashMap<String, Student>();
		map.put("100", new Student("100", "X"));
		map.put("103", new Student("103", "T"));
		map.put("102", new Student("102", "A"));

		System.out.println(map.get("102"));
		for (Map.Entry<String, Student> x : map.entrySet()) {
			System.out.println(x);
		}

	}
}
