package class6;

public interface StudentsManager {
	public void addStudent(Student student);

	public void deleteStudent(String id);

	public void modifyStudent(String id, Student student);

	public Student findStudent(String name);

	public int getStudentCount();

	public void display();

}
