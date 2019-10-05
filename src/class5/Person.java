package class5;

class Math {
	final double PI = 22 / 7;
}

public class Person {
	final String name;
	public int netWorth;

	Person(String name) {
		this.name = name;
	}

	Person() {
		this.name = "";
	}

	public final void eat() {
		System.out.println("Eat food with hands");
		// name = "xxxx";
	}

	public static void main(String args[]) {
		Person siva = new Person("Siva");
		siva.netWorth = 1000;
		Person kai = new Person("Kai");
		kai.netWorth = 500;
		System.out.println(siva.netWorth + " : " + kai.netWorth);
		siva.netWorth = 1500;
		System.out.println(siva.netWorth + " : " + kai.netWorth);
		Doctor doctor = new Doctor();
		
	}
}

class Doctor extends Person {
	void eatMore() {
		super.eat();
	}
}

final class HeartSpecialist extends Doctor {

}
