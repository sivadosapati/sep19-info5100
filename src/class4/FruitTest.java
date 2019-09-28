package class4;

public class FruitTest {

	public static void main(String[] args) {
		Fruit f;
		Apple a = new Apple(0.6f, 0.5f);
		Banana b = new Banana(0.4f, 0.4f);
		f = a;
		f.display();
		f = b;
		f.display();

		Banana bx = (Banana) f;
		bx.display();
	}

}
