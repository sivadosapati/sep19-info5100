package class6;

public class Human {
	String name;

	public Human(String string) {
		this.name = string;
	}

	void talk() {
		loop("talking");
		/*
		 * for (int i = 0; i < 10; i++) { System.out.println(name + " is talking -> " +
		 * i); }
		 */

	}

	void think() {
		loop("thinking");
		/*
		 * for (int i = 0; i < 10; i++) { System.out.println(name + " is thinking -> " +
		 * i); }
		 */
	}

	void loop(String operation) {
		for (int i = 0; i < 10; i++) {

			int a = getRandom(30);
			if (i == a) {
				throw new RuntimeException("Problem with looping -> " + name + " -> " + operation + " -> " + i);
			}
			System.out.println(name + " is " + operation + "-> " + i);
			pause(100);
		}
	}

	int getRandom(int x) {
		return (int) (Math.random() * x);
	}

	void pause(int x) {
		try {
			Thread.sleep(x);
		} catch (Exception e) {

		}
	}
}
