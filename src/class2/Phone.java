package class2;

public class Phone {
	float price;
	String brand;
	PhoneDimension pd;
	String number;
	boolean smart;
	int memoryInMB;
	String color;
	byte cameraPixelSize;
	boolean phoneState = false;

	void turnOn() {
		phoneState = true;
	}

	boolean connectToAnotherPhone(String number) {
		// Logic;
		return true;// return false;
	}

	boolean isSwitchedOn() {
		return phoneState;
	}

	boolean sendAMessage(Phone phone, String message) {
		// Logic;
		return true;// return false;
	}

	void takeAPicture() {

		System.out.println("Take a picture");
	}

	public boolean isExpensive() {
		if (price > 300) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isExpensiveSmartPhone() {

		boolean output;
		if (isExpensive() && smart) {
			output = true;
		} else {
			output = false;
		}
		return output;
	}

	public void display() {
		System.out.println(
				"Phone's price -> " + price + " Phone's smart -> " + smart + " Phone's state -> " + phoneState);
		boolean ps = isSwitchedOn();
		// System.out.println("Checking if Phone is on or off");
		// System.out.println("Seeing the Phone");
		if (ps) {
			System.out.println("Phone is Turned on");
		} else {
			System.out.println("Phone is Turned off");
		}
		// System.out.println("Done verifiying the phone");
		if (isExpensive()) {
			System.out.println("Phone is Expensive");
		} else {
			System.out.println("Phone is Cheap");
		}

		if (isExpensiveSmartPhone()) {
			System.out.println("Phone is Expensive and Smart");
		} else {
			System.out.println("Either Phone is Not expensive or Not Smart or may be both");
		}

	}
}

class PhoneDimension {
	float lenght;
	float width;
	float height;

}