package mine.random.logic;

public class PassingCars {

	public int solution(int[] A) {
		int pairCounter = 0;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == 1) {
					break;
				}
				if (A[j] == 1) {
					pairCounter++;
				}
			}
		}
		return pairCounter;
	}

	public static void main(String[] args) {
		System.out.println(new PassingCars().solution(new int[] { 1, 1, 0, 1 }));
	}

}
