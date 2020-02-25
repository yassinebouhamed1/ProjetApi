package test;

import java.util.Arrays;

public class Algo2 {

	public static void main(String[] args) {
		int[] a = { 3, 4, 4, 6, 1, 4, 4 };
		System.out.println("input=" + Arrays.toString(a));
		System.out.println("Result=" + Arrays.toString(solution(5, a)));

	}

	public static int[] solution(int N, int[] A) {
		int[] B = new int[N];
		int k = 0;
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == N + 1) {
				for (int j = 0; j < B.length; j++) {
					B[j] = max;

				}
				continue;

			} else {
				k = A[i];
				B[k - 1]++;
			}
			max = B[k - 1];

		}
		return B;

	}

}
