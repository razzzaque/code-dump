package mine.random.logic;

public class DivisibleRange {
	public int solution(int A, int B, int K) {
		if (B!=0 && ((B-A) == 0  || B < K && (B - A) < K)) {
			return 0;
		}
		if ((B - A) % K == 0) {
			return ((B - A) / K) + 1;
		}
		return (int) Math.ceil(((double) B - (double) A) / (double) K);
	}

	public static void main(String[] args) {
		System.out.println(new DivisibleRange().solution(0, 0, 1));
	}

}
