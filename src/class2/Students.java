package class2;

public class Students {
	Student[] student = new Student[100];
	int currentStudent = 0;

	void addStudent(Student st) {
		student[currentStudent] = st;
		currentStudent++;
	}

	int getStudentsInChina() {
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			Student s = student[i];
			if (s == null)
				continue;
			if (s.country == Country.CHINA) {
				count++;
			}
		}
		return count;
	}

	int getFemaleCount() {
		int count = 0;
		for (Student s : student) {
			if (s == null)
				continue;
			if (s.gender == Gender.FEMALE) {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {
		Students students = new Students();
		Student steven = new Student();
		steven.country = Country.CHINA;
		Student bharati = new Student();
		bharati.country = Country.INDIA;
		Student megha = new Student();
		megha.country = Country.INDIA;
		students.addStudent(steven);
		students.addStudent(bharati);
		students.addStudent(megha);
		System.out.println(students.getStudentsInChina());
	}
}
