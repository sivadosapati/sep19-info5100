package class8;

import class6.Human;

public class Student extends Human {

	private static Object ANSWER_LOCK = new Object();

	public Student(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	public synchronized void answer() {
		synchronized (ANSWER_LOCK) {
			loop("Answer");
		}
	}
}
