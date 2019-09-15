package class2;

import java.util.Scanner;

public class Algebra {
	int sumOfNNumbers(int n) {
		int sum = 0;
		for (int index = 1; index <= n; index = index + 1) {
			sum = sum + index;
		}
		return sum;
	}

	public static void main(String args[]) {
		Algebra a = new Algebra();
		System.out.println(a.sumOfNNumbers(3));
		System.out.println(a.sumOfNNumbers(5));
		// a.calculateSumOfFiveNumbers();
		a.calculateSumOfAnyNumbersAndSkipMultiplesOfThree();
	}

	void calculateSumOfFiveNumbers() {
		System.out.println("Please enter 5 numbers");
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Please enter number -> " + i);
			int x = scanner.nextInt();
			sum = sum + x;
		}
		System.out.println("Sum -> " + sum);
	}

	void calculateSumOfAnyNumbersAndSkipMultiplesOfThree() {
		System.out.println("Please enter your numbers and enter a negative number to exit");
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int index = 1;
		String output = "";
		while (true) {
			System.out.println("Please enter number -> " + index++);
			int x = scanner.nextInt();
			if (x < 0) {
				break;
			}
			if (x % 3 == 0) {
				continue;
			}
			output = output + x + " + ";
			sum = sum + x;
		}
		output = output.substring(0, output.length() - 3);
		System.out.println(output + " = " + sum);

	}
}
