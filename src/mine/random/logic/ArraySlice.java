package mine.random.logic;

import java.util.Arrays;

public class ArraySlice {
	public int solution(int[] A) {
		int minimalLoc = 0;
		int totalSUm = Arrays.stream(A).sum();
		int leftSum = 0;
		for (int i = 0; i < A.length - 1; i++) {
			leftSum = A[i];
			for (int j = i + 1; j < A.length; j++) {
				leftSum += A[j];
				if (leftSum / (j - i + 1) < totalSUm) {
					totalSUm = leftSum / (j - i + 1);
					minimalLoc = i;
				}
				;
			}

		}
		return minimalLoc;
	}

	public static void main(String[] args) {
		System.out.println(new ArraySlice().solution(new int[] {4, 2, 2, 5, 1, 5, 8}));
	}

}
