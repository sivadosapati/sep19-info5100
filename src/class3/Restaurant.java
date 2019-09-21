package class3;

public class Restaurant {

	public static void main(String[] args) {
		Food burger = new Food();
		Food pizza = new Food();
		burger.setPrice(2);
		pizza.setPrice(4);
		System.out.println(burger.getPrice());
		System.out.println(pizza.getPrice());
		burger.setPrice(-4);
		System.out.println(burger.getPrice());

	}

}
