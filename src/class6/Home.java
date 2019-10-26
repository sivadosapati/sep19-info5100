package class6;

public class Home {

	public static void main(String[] args) throws Exception {
		Human steven = new Human("Steven");
		Human kai = new Human("Kai");
		long start = System.currentTimeMillis();
		executeSequentially(steven, kai);
		// executeParallely(steven, kai);
		long end = System.currentTimeMillis();

		System.out.println("total time -> " + (end - start));

	}

	private static void executeParallely(Human steven, Human kai) throws Exception {
		TalkingThread stevenTalk = new TalkingThread(steven);
		ThinkingThread stevenThink = new ThinkingThread(steven);
		TalkingThread kaiTalk = new TalkingThread(kai);
		ThinkingThread kaiThink = new ThinkingThread(kai);
		stevenTalk.start();
		stevenThink.start();
		kaiTalk.start();
		kaiThink.start();
		// stevenTalk.join();
		// stevenThink.join();
		// kaiTalk.join();
		// kaiThink.join();

	}

	private static void executeSequentially(Human steven, Human kai) {
		steven.talk();
		steven.think();
		kai.talk();
		kai.think();
	}

	static class ThinkingThread extends Thread {
		private Human human;

		public ThinkingThread(Human h) {
			this.human = h;
		}

		public void run() {
			human.think();
		}
	}

	static class TalkingThread extends Thread {
		private Human human;

		public TalkingThread(Human h) {
			this.human = h;
		}

		public void run() {
			human.talk();
		}
	}

}
