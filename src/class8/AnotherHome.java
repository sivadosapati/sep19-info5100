package class8;

import class6.Human;

public class AnotherHome {

	public static void main(String[] args) {
		Human ruby = new Human("Ruby");
		Human cecilia = new Human("Cecilia");
		Thread rubyTalk = new Thread(new TalkRunner(ruby));
		Thread ceciliaTalk = new Thread(new TalkRunner(cecilia));
		Thread rubyThink = new Thread(() -> ruby.think());
		Thread ceciliaThink = new Thread(() -> cecilia.think());
		rubyTalk.start();
		ceciliaTalk.start();
		rubyThink.start();
		ceciliaThink.start();
	}

	static class TalkRunner implements Runnable {
		private Human h;

		public TalkRunner(Human h) {
			this.h = h;
		}

		@Override
		public void run() {
			h.talk();

		}

	}

}
