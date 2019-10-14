package class3;

public class StevenHome {

	public static void main(String[] args) {
		iPhone stevenPhone = new iPhone(Color.BLACK, iPhoneModel.ELEVEN, 64);
		stevenPhone.display();
		// stevenPhone.number = "425-345-1234";
		stevenPhone.setNumber("425-345-1234");
		stevenPhone.display();
		// stevenPhone.price = 10;

		stevenPhone.display();
		// stevenPhone.number = "100";
		stevenPhone.setNumber("100");
		// stevenPhone.memoryInGB = 4056;
		stevenPhone.display();
		System.out.println("Price of my phone -> " + stevenPhone.getPrice());

		iPhone kiaPhone;
		kiaPhone = stevenPhone;
		kiaPhone.setNumber("212-765-8765");
		kiaPhone.display();
		

	}

}
