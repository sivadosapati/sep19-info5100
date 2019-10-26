package class6;

import java.util.List;

public interface StudentsManager {
	public void addStudent(Student student) throws RuntimeException;

	public void deleteStudent(String id);

	public void modifyStudent(String id, Student student);

	public Student findStudent(String name);

	public int getStudentCount();

	public void display();

	public List<Student> getStudents();

}
