package test;

import java.util.Arrays;

public class Algo1 {

	public static void main(String[] args) {
		int A[] = { 1000020, 2, 2, 1, 1, 1000020, 33 };
		if (A.length == 0) {
			System.out.println("This list is empty ");
		} else if (A.length % 2 == 0)
			System.out.println("Could not found the unpaired element ");
		else
			System.out.println("unpaired element = " + solution(A));

	}

	public static int solution(int[] a) {
		Arrays.sort(a);
		int found = a[a.length - 1];
		int i = 0;
		while (i < a.length - 1 && found >= a[a.length - 1]) {
			if (a[i] != a[i + 1])
				found = a[i];
			i += 2;

		}
		return found;
	}

}
