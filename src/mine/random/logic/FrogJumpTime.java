package mine.random.logic;

public class FrogJumpTime {
	public int solution(int X, int[] A) {
		for(int i = 0 ; i < A.length ;i++) {
			if(A[i] == X) {
				return i;
			}
		}
		return -1;
    }
	public static void main(String[] args) {
		System.out.println(new FrogJumpTime().solution(6, new int[] {}));
	}

}
