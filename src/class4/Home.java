package class4;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {

		Burger b = new Burger();
		Icecream ic = new Icecream();
		Chocolate c = new Chocolate();
		Kid kid = new Kid();
		kid.eatChocolate(new Chocolate());
		kid.eatIcecream(new Icecream());
		kid.eatBurger(new Burger());

		kid.eat(new Burger());
		kid.eat(new Chocolate());

		kid.eat(c, b);
		kid.eat(c, ic);

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the number of food items you want to eat - 1 or 2");
			int x = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter the Food type. C for chocolate, I for Icecream, B for Burger");
			Food f = createFood(scanner.nextLine());
			kid.eat(f);
		}

	}

	private static Food createFood(String nextLine) {
		if (nextLine.equals("C"))
			return new Chocolate();
		if (nextLine.equals("B"))
			return new Burger();
		return new Icecream();
	}

}

interface Food {

	void consume();

}

class Kid {

	public void eatChocolate(Chocolate c) {
		System.out.println("Eat Chocolate");
	}

	public void eatIcecream(Icecream ic) {
		System.out.println("Eat Icecream");
	}

	public void eatBurger(Burger b) {
		System.out.println("Eat Burger");
	}

	public void eat(Chocolate c) {
		eatChocolate(c);
	}

	public void eat(Chocolate cc, Chocolate c) {
		System.out.println("xxx");
	}

	public void eat(Icecream ic) {
		eatIcecream(ic);
	}

	public void eat(Burger b) {
		eatBurger(b);
	}

	public void eat(Burger b, Chocolate c) {

	}

	public void eat(Chocolate c, Icecream ic) {

	}

	public void eat(Burger b, Icecream ic) {

	}

	public void eat(Chocolate c, Burger b) {

	}

	public void eat(Food f) {
		f.consume();
	}

	public void eat(Food a, Food b) {
		a.consume();
		b.consume();
	}
}
