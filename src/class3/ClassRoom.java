package class3;

public class ClassRoom {

	public static void main(String[] args) {
		Teacher siva = new Teacher(450, 500);
		Teacher kiaReferenceToSiva = siva;
		Teacher steven = siva;
		steven.moneyInWalletNotEncapsulated = steven.moneyInWalletNotEncapsulated - 100;
		kiaReferenceToSiva.moneyInWalletNotEncapsulated = 0;
		System.out.println(siva.moneyInWalletNotEncapsulated);
		siva.moneyInWalletNotEncapsulated = -100;
		System.out.println(siva.moneyInWalletNotEncapsulated);
		
		

	}

}
