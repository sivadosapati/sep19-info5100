package class4;

public class Picnic {

	public static void main(String[] args) {
		Fruit f = new Apple(0, 0);

		Apple a = new Apple(0, 0);
		a = (Apple)f;

		Banana b = new Banana(0, 0);
		
		f = a;
		f = b;

		Person jayven = new Person();
		SmartPhone sp = new SmartPhone();
		Camera c = new Camera();
		jayven.capture(c);
		jayven.c = c;
		jayven.sp = sp;
		System.out.println("Play and Wrap up...");
		jayven.setCameraAsCapturer();
		jayven.playWithFriends();
		jayven.setSmartPhoneAsCapturer();
		jayven.wrapUp();
		
		Capturer cap;
		SmartPhone x = new SmartPhone();
		Camera cc = new Camera();
		System.out.println("-----------------");
		cap = x;
		cap.takePicture();
		cap = cc;
		cap.takePicture();
	}

}

class Person {
	SmartPhone sp;
	Camera c;
	Capturer capturer;

	void setSmartPhoneAsCapturer() {
		capturer = sp;
	}

	void setCameraAsCapturer() {
		capturer = c;
	}

	void capture(SmartPhone p) {
		p.takePicture();
	}

	void inviteFriend() {
		sp.makePhoneCall();
	}

	void capture(Camera c) {
		c.takePicture();
	}

	void playWithFriends() {
		capturer.takePicture();
		System.out.println("Play again");
		capturer.takePicture();
	}

	void wrapUp() {
		System.out.println("Wrap up");
		capturer.takePicture();
	}
}

interface Capturer {
	abstract void takePicture();
}

interface Phone{
	void makePhoneCall();
}

class SmartPhone implements Capturer, Phone {
	public void takePicture() {
		System.out.println("iPhone is taking picture");
	}

	public void makePhoneCall() {
		System.out.println("Making phone call");
	}
}

class Camera implements Capturer {
	public void takePicture() {
		System.out.println("Camera is taking picture");
	}
}

class iPad {
	void takePicture() {
		System.out.println("iPad is taking picture");
	}
}
