package class6;

public class Student implements Comparable {
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String id;
	private String name;

	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {

	}

	public String toString() {
		return "[Name,Id] = [" + getName() + "," + getId() + "]";
	}

	public int hashCode() {
		return this.getId().hashCode();
	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		return s.getId().equals(this.getId());
	}

	public int compareTo(Object o) {
		Student s = (Student) o;
		return this.getName().compareTo(s.getName());
		// return this.getId().compareTo(s.getId());
	}

}
