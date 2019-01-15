package mine.random.logic;

import java.util.Arrays;

public class MissingElement {
	public int solution(int[] A) {
		if (A.length == 0) {
			return 1;
		}
		Arrays.sort(A);
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] + 1 == A[i + 1]) {
				continue;
			}
			return A[i] + 1;
		}
		return A[A.length-1] + 1;
	}

	public static void main(String[] args) {
		MissingElement e = new MissingElement();
		System.out.println(e.solution(new int[] {6}));
	}

}
