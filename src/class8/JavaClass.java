package class8;

public class JavaClass {

	public static void main(String[] args) {
		Student yashaswini = new Student("Yashaswini");
		Student christine = new Student("Christine");
		new Thread(() -> yashaswini.answer()).start();

		new Thread(() -> christine.answer()).start();

		new Thread(() -> yashaswini.think()).start();

		new Thread(() -> christine.think()).start();

	}

}
