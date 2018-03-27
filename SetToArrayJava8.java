package coding_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetToArrayJava8 {

	public static void main(String[] args) {
		Set<Integer> hashset = new HashSet<>(Arrays.asList(12, 34, 56, 78, 99));

		int[] array = hashset.stream().mapToInt(Number::intValue).toArray();

		for (int i : array) {
			System.out.println(i);
		}

	}
}