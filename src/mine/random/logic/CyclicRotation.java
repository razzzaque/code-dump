package mine.random.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CyclicRotation {

	public int[] solution(int[] A, int K) {
		int temp = 0;
		for (int i = 0; i < K; i++) {
			for (int j = A.length - 1; j > 0; j--) {
				temp = A[j];
				A[j] = A[j - 1];
				A[j - 1] = temp;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		CyclicRotation c = new CyclicRotation();
		Arrays.stream(c.solution(new int[] { 1, 2, 3 }, 2)).boxed().collect(Collectors.toList())
				.forEach(i -> System.out.println(i));
	}

}
