package mine.random.logic;

import java.util.Arrays;

public class PermutationCheck {
	 public int solution(int[] A) {
		 if(A[0] != 1) {
			 return 0;
		 }
		 Arrays.sort(A);
		 for(int i = 0 ; i < A.length-1 ; i++) {
			 if (A[i] + 1 == A[i + 1]) {
					continue;
				}
				return 0;
		 }
		return 1;
	    }
	public static void main(String[] args) {
		PermutationCheck c = new PermutationCheck();
		System.out.println(c.solution(new int[] {2}));
	}

}
