package class7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/sdosapati/abc.txt");
		FileOutputStream fos = new FileOutputStream(file);
		String data = "Seattle is a beautiful place.";
		fos.write(data.getBytes());
		fos.close();

	}

}
