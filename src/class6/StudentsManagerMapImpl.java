package class6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsManagerMapImpl implements StudentsManager {

	private Map<String, Student> studentsMap = new HashMap<String, Student>();

	@Override
	public void addStudent(Student student) {
		String id = student.getId();
		Student s = studentsMap.get(id);
		if (s == null) {
			studentsMap.put(student.getId(), student);
		} else {

			throw new RuntimeException("Student with id -> " + id + " is already added");
		}

	}

	@Override
	public void deleteStudent(String id) {
		studentsMap.remove(id);

	}

	@Override
	public void modifyStudent(String id, Student student) {
		if (!id.equals(student.getId())) {
			throw new RuntimeException(id + " is not equal to the student's id -> " + student.getId());
		}
		studentsMap.put(id, student);

	}

	@Override
	public Student findStudent(String name) {
		for (Student s : studentsMap.values()) {
			if (s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public int getStudentCount() {
		return studentsMap.size();
	}

	@Override
	public void display() {
		System.out.println(studentsMap.values());

	}

	@Override
	public List<Student> getStudents() {
		return new ArrayList<Student>(studentsMap.values());
	}

}
