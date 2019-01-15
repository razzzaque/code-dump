package mine.random.logic;

public class NestingParanthesis {
	public int solution(String S) {
		int counter = 0;
		int length = 0;
		while (length < S.length()) {
			if ('(' == (S.charAt(length))) {
				counter++;
				length++;
			} else if (counter > 0) {
				counter--;
				length++;
				
			} else {
				return 0;
			}
		}
		if (counter == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(new NestingParanthesis().solution("(())))"));
	}

}
