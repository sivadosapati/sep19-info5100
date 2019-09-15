package class2;

public class StringTest {

	public static void main(String[] args) {
		int index = 10;
		String n1 = "Siva";
		System.out.println(n1.length());
		System.out.println(n1.substring(0, 2));
		System.out.println(n1.replace('S', 'D'));
		System.out.println("-----");
		String n2 = new String("Siva");
		String n3 = "Siva";
		String n5 = new String("Siva");
		String n4 = "Siva Dosapati";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n1 == n2);
		System.out.println(n1 == n3);
		System.out.println(n2 == n5);

		StringBuffer sb = new StringBuffer("Siva");
		System.out.println("-----");
		System.out.println(sb);
		sb.setCharAt(0, 'D');
		System.out.println(sb);
		sb.append(" Dosapati");
		System.out.println(sb);
	}

}
