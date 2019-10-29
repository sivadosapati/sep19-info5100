package class7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromFile {

	public static void main(String[] args) throws Exception {
		File file = new File("/Users/sdosapati/abc.txt");
		FileInputStream fis = new FileInputStream(file);
		readFromStream(fis);
		InputStream is = System.in;

	}

	private static void readFromStream(FileInputStream fis) throws IOException {
		while (true) {
			int x = fis.read();
			if (x == -1)
				break;
			char c = (char) x;
			System.out.print(c);
		}
		fis.close();

	}

}
