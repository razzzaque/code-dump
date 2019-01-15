package mine.random.logic;

public class BinaryGap {

	public int solution(int N) {
		String[] binary = Integer.toBinaryString(N).split("");
		int largestGap = 0;
		int count = 0;
		for (int i = 0; i < binary.length; i++) {
			if ("0".equals(binary[i])) {
				count++;
			} else {
				if (count > largestGap) {
					largestGap = count;
				}
				count = 0;
			}
		}
		return largestGap;
	}

	public static void main(String[] args) {
		BinaryGap b = new BinaryGap();
		System.out.println(b.solution(561892));
	}

}
