package mine.random.logic;

public class FrogJump {
	public int solution(int X, int Y, int D) {
		int dist = Y-X;
		if(dist == 0) {
			return 0;
		}
		
		return (int) Math.ceil(((double)dist/D));
    }
	public static void main(String[] args) {
		FrogJump jump = new FrogJump();
		System.out.println(jump.solution(200, 300, 9));
	}
}
