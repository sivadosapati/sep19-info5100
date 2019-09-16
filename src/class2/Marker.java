package class2;

public class Marker {
	String color;
	float price = 0.25f;
	boolean abilityToWrite = true;

	void writeOnBoard() {
		System.out.println("Writing with -> " + color);
	}

	boolean canWrite() {
		return abilityToWrite;
	}
}
