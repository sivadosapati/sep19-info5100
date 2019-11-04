package class8;

import class6.Human;

public class Home2 {

	public static void main(String[] args) {
		Human ruby = new Human("Ruby");
		new Thread(() -> ruby.talk()).start();
		new Thread(() -> ruby.think()).start();
		new Thread(() -> ruby.eat()).start();
		Human steven = new Human("Steven");
		new Thread(() -> steven.talk()).start();
		new Thread(() -> steven.think()).start();
		new Thread(() -> steven.eat()).start();

	}

}
