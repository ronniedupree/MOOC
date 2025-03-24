import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Test {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		String eldest = "";
		int max = 0;
		int count = 0;

		while (true) {
			String input = reader.nextLine();
			if (input.isEmpty()) {
				break;
			}

			String[] parts = input.split(",");
			String name = parts[0];
			int age = Integer.parseInt(parts[1]);

			if (age > max) {
				max = age;
				eldest = name;
			}

			count = count + 1;
		}

		if (count > 0) {
			System.out.println("Highest age: " + max);
			System.out.println("Name: " + eldest);
		} else {
			System.out.println("No input");
		}

	}
}