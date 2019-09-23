package class3;

public class iPhone {
	private float price;
	private Color color;
	private int memoryInGB;
	private iPhoneModel model;
	private String number;

	void setNumber(String number) {
		if (number.length() != 12) {
			// throw new IllegalArgumentException("Not a right number -> " + number);
			System.out.println("You are changing it to an incorrect number, so I'm not changing");
			return;
		}
		this.number = number;
	}

	iPhone() {
		// color = Color.BLACK;
		// memoryInGB = 128;
		// model = iPhoneModel.TEN;
		this(Color.BLACK, iPhoneModel.TEN, 64);
	}

	iPhone(Color color, iPhoneModel model, int mem) {
		System.out.println("Setting Color -> " + color + " : Setting model -> " + model);
		init(color, model, mem);
	}

	float getPrice() {
		return price;
	}

	void init(Color color, iPhoneModel model, int mem) {
		if (mem > 1024 || mem < 1) {
			throw new IllegalArgumentException("Memory should be between 1 and 1024 only but you are asking for " + mem
					+ " phone, which is not possible");
		}
		this.color = color;
		this.model = model;
		memoryInGB = mem;
		calculatePrice();
	}

	iPhone(Color color, iPhoneModel model, int mem, String number) {
		this(color, model, mem);
		this.number = number;
	}

	private void calculatePrice() {
		price = 500;
		if (memoryInGB == 64) {
			if (model == iPhoneModel.TEN) {
				price = 724;
			}
			if (model == iPhoneModel.ELEVEN) {
				price = 824;
			}

		}
		if (memoryInGB > 64) {
			if (model == iPhoneModel.TEN) {
				price = 924;
			}
			if (model == iPhoneModel.ELEVEN) {
				price = 1024;
			}

		}

	}

	iPhone(Color color) {
		// this.color = color;
		// memoryInGB = 128;
		// model = iPhoneModel.TEN;
		this(color, iPhoneModel.TEN, 64);
		// this(color);
	}

	void display() {
		System.out.println("[Color,Price,Memory,Model,Number] = [" + color + "," + price + "," + memoryInGB + ","
				+ model + "," + number + "]");
		//price--;
	}
}

enum iPhoneModel {
	SIX, SEVEN, TEN, ELEVEN;
}

enum Color {

	RED, BLACK, WHITE, GOLD;
}
