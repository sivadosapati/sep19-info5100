package class3;

public class Student {
	private String name;
	private String roll;
	private float gpa;
	private String ssn;

	public String answerQuestion(String question) {
		String answer = null;
		if( isComplicated(question)) {
			return "I can't answer question";
		}
		if(isEasy(question)) {
			return findFromMemory(question);
		}
		if(isMedium(question)) {
			return askAnotherStudent(question);
		}
		return answer;
	}

	private String askAnotherStudent(String question) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isMedium(String question) {
		// TODO Auto-generated method stub
		return false;
	}

	private String findFromMemory(String question) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isEasy(String question) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isComplicated(String question) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isMale() {
		// name = "Mr Siva Dosapati"
		// return writeLogicWithoutAbstraction();
		return writeLogicWithAbstraction();
	}

	private boolean writeLogicWithAbstraction() {
		return name.startsWith("Mr ");
	}

	private boolean writeLogicWithoutAbstraction() {
		char ch[] = name.toCharArray();
		if (ch.length == 0) {
			return false;
		}
		if (ch.length == 1) {
			return false;
		}
		if (ch[0] == 'M' && ch[1] == 'r' && ch[2] == ' ') {
			return true;
		}
		return false;
	}

	Student(String name, String roll) {
		this.name = name;
		this.roll = roll;
		gpa = 3;
	}

	private Student() {

	}

	Student(String name) {
		this.name = name;
	}

	public void finalize() {
		System.out.println(name + " is destroyed");
	}

	Student(String name, String roll, float gpa) {
		this(name, roll);
		this.gpa = gpa;
		if (gpa > 4 || gpa < 1) {
			throw new IllegalArgumentException();
		}
	}

	void display() {
		System.out.println("Name -> " + name + " : Roll -> " + roll + " : GPA -> " + gpa);
	}

	private void print() {

	}

	public static void main(String args[]) {
		Student firstStudent = new Student("Kai", "NU453276", 2.5f);
		Student kaiProxy = firstStudent;
		System.out.println(firstStudent.hashCode());
		new Student("Cecilia");
		new Student("Megha");
		firstStudent.display();
		firstStudent = null;
		firstStudent = new Student("Kai", "NU453276", 2.5f);
		System.out.println(firstStudent.hashCode());
		// Runtime.getRuntime().gc();
		System.out.println("Done");
		Student s = new Student("Mr Stephen");
		System.out.println(s.isMale());
		Student s1 = new Student("Miss Angika");
		System.out.println(s1.isMale());
		Student a = new Student("x");
		System.out.println(a.isMale());
		Student b = new Student("M");
		System.out.println(b.isMale());

	}

	public float getGPA() {
		// TODO Auto-generated method stub
		return gpa;
	}
}
