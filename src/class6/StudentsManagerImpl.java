package class6;

public class StudentsManagerImpl implements StudentsManager {

	private Student[] students = new Student[5];
	int currentStudent = 0;

	@Override
	public void addStudent(Student student) {
		if (currentStudent == students.length) {
			expandStudents();
		}

		students[currentStudent] = student;
		currentStudent++;
	}

	private void expandStudents() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(String id) {
		for (int i = 0; i < students.length; i++) {
			Student x = students[i];
			if (x == null)
				continue;
			if (x.getId().equals(id)) {
				students[i] = null;
				shiftStudents(i + 1);
				currentStudent--;
				return;
			}
		}

	}

	private void shiftStudents(int i) {
		for (int index = i; index < students.length; index++) {
			students[index - 1] = students[index];
			if (index == currentStudent) {
				students[index] = null;
				return;
			}

		}

	}

	@Override
	public void modifyStudent(String id, Student student) {
		for (int i = 0; i < students.length; i++) {
			Student x = students[i];
			if (x == null)
				continue;
			if (x.getId().equals(id)) {
				students[i].setName(student.getName());
				return;
			}
		}

	}

	@Override
	public Student findStudent(String name) {
		for (int i = 0; i < students.length; i++) {
			Student x = students[i];
			if (x == null)
				continue;
			if (x.getName().equals(name)) {
				return x;

			}
		}
		return null;
	}

	@Override
	public int getStudentCount() {
		return currentStudent;
	}

	@Override
	public void display() {
		for (Student x : students) {
			if (x == null)
				continue;
			System.out.println(x);
		}

	}

}
