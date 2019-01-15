package mine.random.logic;

import java.util.Arrays;

public class SmallestMissing {
	public int solution(int[] A) {
		Arrays.sort(A);
		int smallestNumber = 1;
		for (int i = 0; i < A.length; i++) {
			if(A[i] <= 0 || (i > 0 && A[i] == A[i-1])) {
				continue;
			}else if(A[i] == smallestNumber) {
				smallestNumber++;
			}else {
				break;
			}
		}
		return smallestNumber;

	}

	public static void main(String[] args) {
		System.out.println(new SmallestMissing().solution(new int[] { -1, 1,2,2,5 }));
	}

}
