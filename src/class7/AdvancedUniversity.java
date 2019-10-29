package class7;

import class6.StudentsManager;
import class6.University;

public class AdvancedUniversity {

	public static void main(String[] args) throws Exception {
		StudentsManager manager = new StudentsManagerFileImpl();
		University.operateOnStudents(manager);

	}

}
