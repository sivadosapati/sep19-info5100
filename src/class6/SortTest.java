package class6;

import java.util.Comparator;
import java.util.TreeSet;

public class SortTest {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>(new NameComparator());
		// TreeSet<Student> ts = new TreeSet<Student>(new IdComparator());
		ts.add(new Student("100", "Kei"));
		ts.add(new Student("101", "Steven"));
		ts.add(new Student("102", "Ruby"));
		for (Student s : ts) {
			System.out.println(s);
		}

	}

	static class IdComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Student a = (Student) o1;
			Student b = (Student) o2;
			return a.getId().compareTo(b.getId());
		}

	}

	static class NameComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Student a = (Student) o1;
			Student b = (Student) o2;
			return b.getName().compareTo(a.getName());
		}

	}

}
