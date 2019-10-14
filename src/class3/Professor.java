package class3;

public class Professor {

	int countStudentsWithGPAGreaterThan(Student[] students, float gpa) {
		int count = 0;
		for (Student s : students) {
			float g = s.getGPA();
			if (g > gpa) {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		Student s = new Student("Kai");
		s.display();
		//s.print();
	}
}
