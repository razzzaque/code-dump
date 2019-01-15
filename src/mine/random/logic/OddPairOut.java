package mine.random.logic;

import java.util.HashSet;

public class OddPairOut {
	public int solution(int[] A) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < A.length ; i++) {
			if(!set.add(A[i])) {
				set.remove(A[i]);
			}
		}
		return (int) (set.toArray())[0];
	}

	public static void main(String[] args) {
		OddPairOut odd = new OddPairOut();
		System.out.println(odd.solution(new int[] {1,1,3}));
	}

}
