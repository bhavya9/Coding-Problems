package coding_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filterListJava8 {
	private static List<String> filterList(List<String> fruits, String filter) {
		List<String> result = new ArrayList<>();
		for (String fruit : fruits) {
			if (!filter.equals(fruit)) {
				result.add(fruit);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "lemon");

		System.out.println("Before..");

		for (String str : fruits) {
			System.out.println(str);
		}

		List<String> result = filterList(fruits, "lemon");
		System.out.println("After..");
		for (String str : result) {
			System.out.println(str);
		}

	}
}