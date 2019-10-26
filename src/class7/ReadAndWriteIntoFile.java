package class7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadAndWriteIntoFile {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file name where you want to write");
		String fileName = scanner.nextLine();
		File file = new File(fileName);
		FileOutputStream fos = new FileOutputStream(file, true);
		PrintStream ps = new PrintStream(fos);
		while (true) {
			System.out.println("Enter content in a line and if you are done, type Exit");
			String line = scanner.nextLine();
			if (line.equals("Exit"))
				break;
			ps.println(line);
		}
		ps.close();
		fos.close();

	}

}
