package class5;

import java.util.*;

public class Student {
	static Frisbee frisbee = new Frisbee();
	IDCard idCard = new IDCard();
	static Professor professor = new Professor();

	Student() {

	}

	static void dumpFrisbeeInGarbageCan() {
		frisbee = null;
		// idCard = null;
	}

	public String toString() {
		return "Frisbee -> " + frisbee + " IDCard -> " + idCard;
	}

	// java Student
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		Student.professor.teach();
		System.out.println("------");

		Student a = new Student();
		Student b = new Student();
		System.out.println(a);
		System.out.println(b);
		a.idCard = null;
		System.out.println(a);
		Student.frisbee = null;
		System.out.println(a);
		System.out.println(b);
		System.out.println("---------");
		System.out.println(a.professor.isSick());
		System.out.println(b.professor.isSick());
		a.professor.setSick(true);
		System.out.println("---------");
		System.out.println(a.professor.isSick());
		System.out.println(b.professor.isSick());

		Student.professor.teach();
		a.professor.teach();
		b.professor.teach();

	}
}

class Professor {
	boolean sick = false;
	String name = "Siva";

	public boolean isSick() {
		return sick;

	}

	public void setSick(boolean sick) {
		this.sick = sick;
	}

	public void teach() {
		System.out.println("Teaching");
	}
}

class Frisbee {

}

class IDCard {

}
