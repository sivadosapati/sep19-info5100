package class6;

import java.util.Scanner;

public class University {

	public static void main(String[] args) {
		// StudentsManager manager = new StudentsManagerImpl();
		// StudentsManager manager = new StudentsManagerListImpl();
		StudentsManager manager = new StudentsManagerMapImpl();
		operateOnStudents(manager);

	}

	public static void operateOnStudents(StudentsManager manager) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter (ADD|DELETE|MODIFY|COUNT|DISPLAY|EXIT");
			String line = scanner.nextLine();
			if (line.equals("ADD")) {
				addStudent(scanner, manager);
			}
			if (line.equals("DELETE")) {
				deleteStudent(scanner, manager);
			}
			if (line.equals("MODIFY")) {
				modifyStudent(scanner, manager);
			}
			if (line.equals("COUNT")) {
				System.out.println("Count of Students -> " + manager.getStudentCount());
			}
			if (line.equals("DISPLAY")) {
				manager.display();
			}
			if (line.equals("EXIT")) {
				break;
			}

		}

	}

	private static void deleteStudent(Scanner scanner, StudentsManager manager) {
		System.out.println("Enter Id for deleting Student");
		String line = scanner.nextLine();
		manager.deleteStudent(line);
	}

	private static void modifyStudent(Scanner scanner, StudentsManager manager) {
		System.out.println("Enter Id, Name for modifying Student");
		String line = scanner.nextLine();
		String tokens[] = line.split("\\,");
		Student s = new Student(tokens[0], tokens[1]);
		manager.modifyStudent(tokens[0], s);
	}

	private static void addStudent(Scanner scanner, StudentsManager manager) {
		System.out.println("Enter Id, Name for adding Student");
		String line = scanner.nextLine();
		String tokens[] = line.split("\\,");
		Student s = new Student(tokens[0], tokens[1]);
		manager.addStudent(s);

	}

}
