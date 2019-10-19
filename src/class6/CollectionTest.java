package class6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		operate("Vector", new Vector());
		operate("ArrayList", new ArrayList());
		operate("HashSet", new HashSet());
		operate("LinkedHashSet", new LinkedHashSet());
		operate("LinkedList", new LinkedList());
		TreeSet set = new TreeSet();
		operate("TreeSet", set);
		iterateOnSet(set);

		workOnStack();
		workOnPriorityQueue();

	}

	private static void workOnPriorityQueue() {
		System.out.println("\n..Priority Queue");
		PriorityQueue pq = new PriorityQueue();
		pq.offer("Siva");
		pq.offer("Adam");
		pq.offer("John");
		System.out.println(pq.poll());

	}

	private static void workOnStack() {
		Stack s = new Stack();
		s.push("Siva");
		s.push("Kumar");
		s.push("Steven");
		System.out.println("\nStacks....");
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

	private static void iterateOnSet(Collection c) {
		System.out.println("--Iterator---");
		Iterator i = c.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			System.out.print(o + " , ");
		}
		System.out.println("\n-------Loop");

		for (Object o : c) {
			System.out.print(o + " , ");
		}

	}

	private static void operate(String name, Collection<String> data) {
		System.out.println(name);
		addObjects(data);
		System.out.println(data);

	}

	private static void addObjects(Collection<String> data) {
		data.add("Siva");
		data.add("Kumar");
		data.add("Kei");
		data.add("Ruby");
		data.add("Yali");
		data.add("Kumar");
		// data.add(new Integer(1));

	}

}
