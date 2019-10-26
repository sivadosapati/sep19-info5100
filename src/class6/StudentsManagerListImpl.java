package class6;

import java.util.ArrayList;
import java.util.List;

public class StudentsManagerListImpl implements StudentsManager {

	private ArrayList<Student> students = new ArrayList<Student>();

	@Override
	public void addStudent(Student student) {
		Student s = findStudentById(student.getId());
		if (s == null)
			students.add(student);
		else {
			throw new RuntimeException("Student with id -> " + student.getId() + " is already added before");
		}

	}

	private Student findStudentById(String id) {
		for (Student s : students) {
			if (s.getId().equals(id)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public void deleteStudent(String id) {
		Student match = null;
		for (Student x : students) {
			if (x.getId().equals(id)) {
				match = x;
				break;
			}
		}
		students.remove(match);
	}

	@Override
	public void modifyStudent(String id, Student student) {
		for (Student s : students) {
			if (s.getId().equals(id)) {
				s.setName(student.getName());
				return;
			}
		}

	}

	@Override
	public Student findStudent(String name) {
		for (Student s : students) {
			if (s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public int getStudentCount() {
		return students.size();
	}

	@Override
	public void display() {
		System.out.println(students);

	}

	@Override
	public List<Student> getStudents() {
		return students;
	}

}
