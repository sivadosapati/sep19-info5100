package class2;

public class PhoneTest {

	public static void main(String[] args) {
		Phone phone = new Phone();
		// phone.display();
		// System.out.println(phone.isSwitchedOn());
		phone.turnOn();
		// phone.display();
		// System.out.println(phone.isSwitchedOn());
		// System.out.println(phone.isExpensiveSmartPhone());
		phone.display();
		phone.price = 400;
		phone.smart = true;
		// System.out.println(phone.isExpensiveSmartPhone());
		System.out.println("-----");
		phone.display();
	}

}
