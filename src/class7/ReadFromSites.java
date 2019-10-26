package class7;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class ReadFromSites {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.google.com");
		InputStream is = url.openConnection().getInputStream();
		Scanner scanner = new Scanner(is);
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		is.close();
	}

}
