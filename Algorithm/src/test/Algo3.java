package test;

import java.util.Arrays;

public class Algo3 {

	public static void main(String[] args) {

		int[] A = { 4, 4, 5, 5, 1 };
		int[] B = { 3, 2, 4, 3, 1 };
		int L = 5;

		System.out.println("Result=" + Arrays.toString(solution(A, B, L)));
	}

	public static int[] solution(int[] A, int[] B, int L) {
		int[] res = new int[L];
		int p; //nombre maximale de "2" dans les combinaisons
		int k; //pour stocker le calcul de la combinaison
		int c; //pour sommer les combinaisons
		for (int i = 0; i < A.length; i++) {
			c = 0;
			p = A[i] / 2;
			for (int j = 1; j <= p; j++) {
				k = comp(j, A[i] - j);
				c = c + k;
			}
			res[i] = (int) ((c + 1) % (2 * B[i]));

		}
		return res;
	}

	public static int comp(int i, int j) {

		return fact(j) / (fact(i) * fact(j - i));
	}

	public static int fact(int j) {
		if (j == 1 || j == 0)
			return 1;
		else
			return j * fact(j - 1);

	}

}
