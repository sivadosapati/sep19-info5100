import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SUT {

	@Test
	public void testForRegularString() {
		assertForOutput("abc", "cba");

	}

	private void assertForOutput(String input, String output) {
		StringUtils su = new StringUtils();

		String expectedOutput = output;
		String actualOutput = su.reverseString(input);
		Assert.assertTrue(expectedOutput.equals(actualOutput));
	}

	@Test
	public void testForNullInput() {
		StringUtils su = new StringUtils();

		String expectedOutput = null;
		String actualOutput = su.reverseString(null);
		Assert.assertTrue(actualOutput == expectedOutput);
	}

	@Test
	public void testForEmptyString() {
		assertForOutput("", "");
	}

	@Test
	public void testForStringWithOneCharacter() {
		assertForOutput("c", "c");
	}

}
