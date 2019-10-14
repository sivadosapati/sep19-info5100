package class4.interfaces;

import java.util.Scanner;

public class ClassRoom {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Professor p = new Professor();
		Student student;
		while (true) {
			System.out.println("Please enter M for Male and F for Female");
			String s = scanner.nextLine();
			if (s.equals("M")) {
				student = new MaleStudent();
			} else {
				student = new FemaleStudent();

			}
			p.askQuestion(student);
		}
	}
}

interface Student {
	void answer();
}

class Professor {
	void askQuestion(Student s) {
		s.answer();
	}
}

class MaleStudent implements Student {

	@Override
	public void answer() {
		System.out.println("Male is answering");

	}

}

class FemaleStudent implements Student {

	@Override
	public void answer() {
		System.out.println("Female is answering");

	}

}
