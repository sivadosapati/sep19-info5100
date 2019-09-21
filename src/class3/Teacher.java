package class3;

public class Teacher {
	public int moneyInWalletNotEncapsulated;//Don't do this

	private int moneyEncapsulated;

	Teacher(int money, int encapsulatedMoney) {
		this.moneyInWalletNotEncapsulated = money;
		this.moneyEncapsulated = encapsulatedMoney;
	}

	public int giveMoney(int money) {
		if (moneyEncapsulated > money) {
			moneyEncapsulated = moneyEncapsulated - money;
			return money;
		}
		throw new IllegalArgumentException("I don't have " + money + " in my pocket");
	}

	public int getMoney() {
		return moneyEncapsulated;
	}

	public void takeMoney(int m) {
		this.moneyEncapsulated += m;
	}

	public void setMoney(int money) {
		this.moneyEncapsulated = money;
	}
}
