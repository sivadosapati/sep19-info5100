package class7;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class FindStudent {

	public static void main(String[] args) throws Exception {
		File file = new File("/Users/sdosapati/temp.txt");
		FileInputStream fis = new FileInputStream(file);
		String nameOfStudentToBeSearched = getNameToBeSearched();
		// searchUsingFileInputStream(fis, nameOfStudentToBeSearched);
		searchUsingScanner(fis, nameOfStudentToBeSearched);

	}

	private static void searchUsingScanner(FileInputStream fis, String nameOfStudentToBeSearched) {
		Scanner scanner = new Scanner(fis);
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			if (line.equals(nameOfStudentToBeSearched)) {
				System.out.println(nameOfStudentToBeSearched + " is found");
				return;
			}
		}
		System.out.println(nameOfStudentToBeSearched + " is not found");

	}

	private static void searchUsingFileInputStream(FileInputStream fis, String nameOfStudentToBeSearched)
			throws Exception {
		StringBuffer fileData = new StringBuffer();

		while (true) {
			int x = fis.read();
			if (x == -1)
				break;
			fileData.append((char) x);

		}
		String data = fileData.toString();
		if (data.contains(nameOfStudentToBeSearched)) {
			System.out.println(nameOfStudentToBeSearched + " is in the file");
		} else {
			System.out.println(nameOfStudentToBeSearched + " is not in the file");
		}
		fis.close();
	}

	private static String getNameToBeSearched() {
		return "Ruby";
		// return "Steven";
	}

}
