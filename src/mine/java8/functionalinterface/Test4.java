package mine.java8.functionalinterface;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		Solution4 solution3 = new Solution4();
		System.out.println("ffff: " + solution3.solution(new int[] { 1, 4, 7, 3, 3, 5 }));
	}

}

class Solution4 {
	public int solution(int[] a) {
		if(a == null || a.length == 0 || a.length > 40000 ) {
			throw new RuntimeException("Invalid Array");
		}
		int dist = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] != a[j]) {
					boolean found = false;
					for (int k = 0; k < a.length; k++) {
						if (((a[i] < a[k]) && (a[k] < a[j])) || ((a[i] > a[k]) && a[k] > a[j]) && (i != k)) {
							// got pair
							found = true;
							break;
						} 
					}

					if (!found) {
						int absd = Math.abs(i - j);
						if (dist == 0) {
							dist = absd;
						} else if (absd < dist) {
							dist = absd;
						}

					}
				}
			}
		}
		return dist;

	}
}