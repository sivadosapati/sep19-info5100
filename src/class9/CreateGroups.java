package class9;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateGroups {

	public static void main(String[] args) throws Exception {
		List<String> students = getStudents();
		int count = 0;
		while (true) {
			if (students.size() == 0)
				break;
			int aa = (int) (Math.random() * students.size());
			int a = count;
			if (a % 16 == 0) {
				System.out.println("Group: " + (1 + a / 16));
			}
			if (a % 4 == 0) {
				System.out.println("\tTeam: " + (1 + (a % 16) / 4));
			}
			String x = students.remove(aa);
			System.out.println("\t\t" + x);
			count++;
		}
	}

	private static List<String> getStudents() throws Exception {
		Scanner scanner = new Scanner(new FileInputStream("/Users/sdosapati/students-2019.txt"));
		ArrayList<String> students = new ArrayList<String>();
		while (scanner.hasNext()) {
			students.add(scanner.nextLine());
		}
		return students;
	}

}
