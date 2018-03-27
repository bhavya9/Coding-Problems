package coding_problems;

import java.util.Arrays;

public class BooleanArray {

	public static void main(String[] args) {
		Boolean[] array = new Boolean[4];
		// initially all values will be null
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		Arrays.fill(array, Boolean.FALSE);
		// all values will be false
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		Arrays.fill(array, Boolean.TRUE);
		// all values will be false
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}