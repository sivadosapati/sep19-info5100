import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetStudents {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream("/Users/sdosapati/data.txt")));

		while (true) {
			String line = reader.readLine();
			if (line == null)
				break;
			if (line.contains("onMouseOver=\"window.status='Student Information'")) {
				line = line.replace("</a> </SPAN></td>", "");
				// System.out.println(line);
				int x = line.lastIndexOf('>');
				String name = line.substring(x + 1);
				String names[] = name.split("\\,");
				System.out.println(names[1].trim() + " " + names[0]);
			}
		}
	}

}
