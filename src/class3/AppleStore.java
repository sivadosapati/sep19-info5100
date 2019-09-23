package class3;

public class AppleStore {

	public static void main(String[] args) {
		iPhone yuyangPhone;
		iPhone cvaPhone;
		iPhone ceciliaPhone = new iPhone(Color.WHITE, iPhoneModel.ELEVEN, 256);
		yuyangPhone = new iPhone();
		cvaPhone = new iPhone(Color.GOLD, iPhoneModel.SEVEN, 512, "425-283-7905");
		yuyangPhone.display();
		cvaPhone.display();
		ceciliaPhone.display();
		//ceciliaPhone.number = "206-543-7124";
		ceciliaPhone.display();
		new iPhone(Color.BLACK, iPhoneModel.SIX, 46);
		System.out.println("Complete");
	}

}
