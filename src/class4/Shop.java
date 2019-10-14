package class4;

public class Shop {

	public static void main(String[] args) {

		// Fruit f = new Fruit();
		// f.display();

		// Siva Dosapati

		Apple apple = new Apple(0.50f, 0.25f);
		Banana banana = new Banana(0.25f, 0.30f);
		apple.display();
		banana.display();
		Orange o = new Orange();
		Mango m = new Mango();
		// m.name = "M";
		// o.name = "Orange";

		// m = new Mango();
		o.price = 0.65f;
		System.out.println(o.price);
		m.setDiscount(0.10f);
		System.out.println(m.getDiscount());

		System.out.println(m.isOnSale());

		// System.out.println(o.isOnSale());
		m.price = 0.65f;
		m.display();
		o.display();
		apple.display();

		Professor siva = new Professor();
		System.out.println("----");
		StudentProfessor megha = new StudentProfessor();
		siva.teach();
		System.out.println("----");
		megha.teach();
	}

}

abstract class Fruit {
	protected float price;
	private boolean spoilt;
	protected float weight;
	private float discount;
	// private String name;

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	Fruit(float price, float weight) {
		this.price = price;
		this.weight = weight;
	}

	public Fruit() {

	}

	public void display() {
		System.out.println(getName() + "[Price,Weight,Discount] = [" + price + "," + weight + "," + discount + "]");
	}

	public String getName() {
		return getClass().getSimpleName();
	}

}

class Banana extends Fruit {

	public Banana(float f, float g) {
		super(f, g);
	}

	public void display() {
		System.out.println("Banana Display");
	}

	public String getName() {
		return "AWESOME BANANA";
	}

}

class Apple extends Fruit {
	public Apple(float f, float g) {
		super(f, g);
		// this.name = "Apple";

	}

	// public void display() {
	// System.out.println("Apple[Price,Weight] = [" + price + "," + weight + "]");
	// }

}

class GalaApple extends Apple {

	public GalaApple(float f, float g) {
		super(f, g);
		// TODO Auto-generated constructor stub
	}

}

class Mango extends Fruit {

	boolean isOnSale() {
		if (getDiscount() >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public void display() {
		super.display();
		// System.out.println("Mango[Price,Weight] = [" + price + "," + weight + "]");
	}

}

class JuicyMango extends Mango {
	// private float weight;

	public void display() {
		float w = super.weight;
		super.display();
	}

}

class CutMango extends Mango {

}

class Orange extends Fruit {
	private boolean hasSeeds;
	private boolean extractJuice = false;

	public boolean canMakeJuice() {
		return extractJuice;
	}

}

class iPhone {
	public void takePicture() {
		System.out.println("iPhone is taking picture");
	}
}

class iPhoneTen extends iPhone {
	boolean twoSimcards;

	boolean canBeThrownInWater() {
		return true;
	}

	public void takePicture() {
		System.out.println("iPhone Ten is taking picture differently");
	}
}

class Professor {
	void teach() {
		greetStudents();
		askQuestions();
		mentionTopics();
		teachTopics();

	}

	public void teachTopics() {
		System.out.println("Professor is Teaching topics");

	}

	public void mentionTopics() {
		System.out.println("Menton Topics");

	}

	public void askQuestions() {
		System.out.println("Professor is asking questions");

	}

	public void greetStudents() {
		System.out.println("Greet Students");

	}

}

class StudentProfessor extends Professor {
	void teach() {
		takeAttendance();
		super.teach();
		thankStudents();
	}

	private void thankStudents() {
		System.out.println("Thank students");

	}

	private void takeAttendance() {
		System.out.println("Take Attendance");

	}

	public void askQuestions() {
		System.out.println("Student Professor is asking questions differently");
	}

	public void greetStudents() {

	}
}
