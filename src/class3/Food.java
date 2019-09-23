package class3;

public class Food {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			System.out.println("I can't set the price to a negative number");
			return;
		}
		this.price = price;
	}

}
