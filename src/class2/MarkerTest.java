package class2;

public class MarkerTest {

	public static void main(String[] args) {
		// Marker red;
		// Marker brown;
		Marker black, brown, red;
		black = new Marker();
		black.color = "Black";
		brown = new Marker();
		brown.color = "Brown";
		red = new Marker();

		red.color = "Red";

		System.out.println(black.color);
		System.out.println(red.color);

		System.out.println(black.canWrite());
		red.writeOnBoard();
		black.writeOnBoard();
		black.abilityToWrite = false;

		System.out.println(black.canWrite());
	}

}
