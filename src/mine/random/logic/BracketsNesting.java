package mine.random.logic;

public class BracketsNesting {
	public int solution(String S) {
		char[] arr = new char[S.length()];
		char nextClose = 0;
		int length = 0;
		int arrCounter = 0;
		char valueAtI;
		while (length < S.length()) {
			valueAtI = S.charAt(length);
			if (valueAtI == '(' || valueAtI == '{' || valueAtI == '[') {
				nextClose = ('(' == valueAtI) ? ')' : ('{' == valueAtI) ? '}' : ']';
				arr[arrCounter] = valueAtI;
				length++;
				arrCounter++;
			} else if (valueAtI == nextClose) {
				length++;
				arrCounter--;
				arr[arrCounter] = 0;
				if (arrCounter > 0) {
					nextClose = ('(' == arr[arrCounter - 1]) ? ')' : ('{' == arr[arrCounter - 1]) ? '}' : ']';
				}else {
					nextClose = 0;
				}
			} else {
				return 0;
			}
		}
		if (arrCounter == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(new BracketsNesting().solution("()(()())((()())(()()))"));
	}

}
