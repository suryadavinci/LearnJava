package com.suryatechsources;

import java.util.Arrays;
import java.util.Random;

public class BranchPredictor {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		int[] a = new int[32536];

		Random rnd = new Random();

		for (int i = 0; i < a.length; i++)
			a[i] = rnd.nextInt() % 256;

		// Arrays.sort(a);

		// System.out.println(Arrays.toString(a));

		long sum = 0;

		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < a.length; k++) {
				if (a[k] > 128)
					sum += a[k];
			}
		}

		System.out.println(sum);
		System.out.println(System.currentTimeMillis() - start);

	}

}
