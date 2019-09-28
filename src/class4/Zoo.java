package class4;

public class Zoo {

	public static void main(String[] args) {
		Lion l = new Lion();
		Elephant e = new Elephant();
		System.out.println("Start");
		l.perform();
		e.perform();
		e.walkInLine();
		l.walkInLine();
		System.out.println("End");
	}

}

abstract class Animal {

	public abstract void perform();

	public void walkInLine() {
		System.out.println(getName() + " is walking in Line");
	}

	protected String getName() {
		return getClass().getSimpleName();
	}
}

class Lion extends Animal {

	@Override
	public void perform() {
		System.out.println("Lion roars");

	}

}

class Elephant extends Animal {

	public void perform() {
		System.out.println("Elephant kicks the ball");

	}

}

class Spoon {

}

class Dog extends Animal {

	@Override
	public void perform() {
		System.out.println("Dog barks");

	}

}

abstract class Rabbit extends Animal {

}

abstract class Student {
	abstract void askQuestion();
}
