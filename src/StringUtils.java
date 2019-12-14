
public class StringUtils {

	public String reverseString(String a) {
		// Siva -> aviS
		if (a == null)
			return null;
		char c[] = a.toCharArray();
		StringBuffer reversal = new StringBuffer();
		for (int j = c.length - 1; j >= 0; j--) {
			reversal.append(c[j]);
		}
		return reversal.toString();

	}

	public int findFirstOccurenceOfSpace(String input) {
		int count = -1;
		for (char c : input.toCharArray()) {
			count++;
			if (c == ' ') {
				return count;
			}
		}
		return -1;
	}
}
