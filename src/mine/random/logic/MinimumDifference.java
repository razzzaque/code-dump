package mine.random.logic;

import java.util.Arrays;

public class MinimumDifference {
	public int solution(int[] A) {
		int sub;
		int leftSum = 0;
		int rightSum = Arrays.stream(A).sum();
		int minimumDiff = rightSum;
		for (int i = 0; i < A.length; i++) {
			leftSum += A[i];
			rightSum -= A[i];
			sub = Math.abs(Math.subtractExact(leftSum, rightSum));
			if(i == 0 || minimumDiff > sub && i != A.length-1) {
				minimumDiff = sub;
			}
		}
		return minimumDiff;
	}

	public static void main(String[] args) {
		MinimumDifference min = new MinimumDifference();
		System.out.println(min.solution(new int[] {-1000, 1000}));
	}

}
