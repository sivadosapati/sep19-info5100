package class8;

import java.util.Arrays;
import java.util.Collection;

public class CollectionsTest {

	public static void main(String[] args) {
		Collection<Integer> numbers = Arrays.asList(1, 14, -12, 652, -11, 87, 98);
		CollectionsOperations co = new CollectionsOperations();
		System.out.println(co.sumOfEvenNumbers(numbers));
		PrimeNumberMatcher pm = new PrimeNumberMatcher();
		// System.out.println(co.findSum(numbers, pm));
		System.out.println(co.findSum(numbers, new NegativeNumberMatcher()));
		int sum = co.findSum(numbers, (Integer n) -> isMultipleOfThree(n));
		sum = co.findSum(numbers, (n) -> {
			System.out.println("Number -> " + n);
			return n % 3 == 0;
		});
		System.out.println(sum);

	}

	public static boolean isMultipleOfThree(Integer number) {
		return number % 3 == 0;
	}

}

class PrimeNumberMatcher implements NumberMatcher {

	@Override
	public boolean isMatching(Integer number) {
		// Logic for Prime number;
		return false;
	}

}

class ThreeMultiples implements NumberMatcher {

	@Override
	public boolean isMatching(Integer number) {
		// TODO Auto-generated method stub
		return false;
	}

}

class NegativeNumberMatcher implements NumberMatcher {

	@Override
	public boolean isMatching(Integer number) {
		if (number < 0) {
			return true;
		}
		return false;
	}

}

interface NumberMatcher {
	public boolean isMatching(Integer number);
}

class CollectionsOperations {
	public int sumOfEvenNumbers(Collection<Integer> numbers) {
		int sum = 0;
		for (Integer x : numbers) {
			if (isEven(x)) {
				sum = sum + x;
			}
		}
		return sum;
	}

	public int sumOfOddNumbers(Collection<Integer> numbers) {
		int sum = 0;
		for (Integer x : numbers) {
			if (!isEven(x)) {
				sum = sum + x;
			}
		}
		return sum;

	}

	public int findSum(Collection<Integer> numbers, NumberMatcher nm) {
		int sum = 0;
		for (Integer x : numbers) {
			if (nm.isMatching(x)) {
				sum += x;
			}

		}
		return sum;
	}

	private boolean isEven(Integer x) {
		if (x % 2 == 0) {
			return true;
		}
		return false;
	}
}
