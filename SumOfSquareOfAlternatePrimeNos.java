package coding_problems;

import java.util.Scanner;

public class SumOfSquareOfAlternatePrimeNos {

	public static void main(String[] args) {
		int i, j, sts = 0, mul = 0, count = 1;

		System.out.println("Enter the n value ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (j = 2; j <= num; j++) {

			for (i = 2; i <= j / 2 && sts != 1; i++) {

				if (j % i == 0) {

					sts = 1;

				}
			}
			if (sts == 0) {
				System.out.println(j);
				System.out.println();

				if (count % 2 != 0) {
					mul = mul + j * j;
				}
				count++;
			}
			sts = 0;
		}
		System.out.println("your result is=" + mul);
	}

}
