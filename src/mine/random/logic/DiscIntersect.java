package mine.random.logic;
// 0 perfomance
public class DiscIntersect {
	public int solution(int[] A) {
		int discLeftEnd = 0;
		int discRightEnd = 0;
		int leftEnd = 0;
		int rightEnd = 0;
		int intersectCntr = 0;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				leftEnd = i - A[i];
				rightEnd = i + A[i];
				discLeftEnd = j - A[j];
				discRightEnd = j + A[j];
				if ((leftEnd == discLeftEnd || rightEnd == discRightEnd) || rightEnd == discLeftEnd
						|| (leftEnd > discLeftEnd && rightEnd < discRightEnd)
						|| (leftEnd < discLeftEnd && rightEnd > discLeftEnd)
						|| (rightEnd > discLeftEnd && rightEnd < discRightEnd) || A[i] == Integer.MAX_VALUE
						|| A[j] == Integer.MAX_VALUE) {
					intersectCntr++;
				}

			}
		}
		return intersectCntr;
	}

	public static void main(String[] args) {
		System.out.println(new DiscIntersect().solution(new int[] { 1, 2147483647, 0 }));
	}

}
