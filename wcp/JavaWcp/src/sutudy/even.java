package sutudy;

//1から10の偶数表示
public class even {
	public static void main(String[] args) {
		for (int number = 1; number <= 10; number++) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}
}