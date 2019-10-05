package class5.exceptions;

import java.util.Scanner;

public class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	void comeToClass() throws HolidayException {
		int a = Util.getRandomNumber(100);
		System.out.println("Random number -> " + a);
		if (a < 30) {
			throw new NotFeelingWellException();
		}
		if (a < 60) {
			RainingException re = new RainingException();
			int b = Util.getRandomNumber(3);
			re.intensity = b;
			throw re;
			// System.out.println("It's raining");
		}
		if (a < 80) {
			throw new BusBrokeDownException();
		}
		if (a < 90) {
			throw new HolidayException();
		}
		System.out.println(name + " is coming to class");

	}

	public static void main(String args[]) {
		try {
			Student kai = new Student("Kai");
			Student steven = new Student("Steven");
			Student ruby = new Student("Ruby");
			letStudentComeToClass(kai);
			letStudentComeToClass(steven);
			letStudentComeToClass(ruby);
			System.out.println("Start the class");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Done");
	}

	public static void mainAnotherOld(String args[]) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter student name, for exit, say exit");
			String line = scanner.nextLine();
			if (line.equals("exit"))
				break;
			Student s = new Student(line);
			letStudentComeToClass(s);

		}
		System.out.println("Start the class");
	}

	public static void mainOld(String args[]) throws HolidayException {
		Student kai = new Student("Kai");
		Student steven = new Student("Steven");
		Student ruby = new Student("Ruby");
		letStudentComeToClass(kai);
		letStudentComeToClass(steven);
		letStudentComeToClass(ruby);
		System.out.println("Start the class");
		/*
		 * for (int i = 0; i < 5; i++) { System.out.println(i + "...");
		 * kai.comeToClass(); steven.comeToClass(); }
		 */
	}

	private static void letStudentComeToClass(Student s) throws HolidayException {
		try {
			s.comeToClass();
		} catch (RainingException re) {
			int i = re.intensity;
			if (i == 2) {
				System.out.println("Intensity of Rain is very high. Don't start the class");
				throw re;
			} else {
				System.out.println("Raining with Intensity -> " + i + " . I will skip, continue with the class");
			}
		} catch (NotFeelingWellException nfwe) {
			System.out.println("Not feeling well. I will skip");
		} catch (RuntimeException be) {
			System.out.println("Some other problem. I will skip");
		}

	}
}

class HolidayException extends Exception {

}

class BusBrokeDownException extends RuntimeException {

}

class RainingException extends RuntimeException {
	int intensity;
}

class NotFeelingWellException extends RuntimeException {

}

class Util {
	static int getRandomNumber(int x) {
		return (int) (Math.random() * x);
	}
}
