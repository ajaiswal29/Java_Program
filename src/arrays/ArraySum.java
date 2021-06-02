package arrays;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {

		int[] a = { 2, 3, 5, 6, 7, 8 };

		int[] ab = new int[3];

		int sum = 0;

		for (int i = 0; i < a.length - 2; i++) {

			int tempSum = a[i] + a[i + 1] + a[i + 2];

			if (tempSum > sum) {
				ab[0] = a[i];
				ab[1] = a[i + 1];
				ab[2] = a[i + 2];
				sum = tempSum;

			}

		}
System.out.println(Arrays.toString(ab));
	}

}
