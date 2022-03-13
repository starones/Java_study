package sutudy;

public class Test04 {
	public static void main(String[] args) {
		int num[] = new int[20];

		for (int i = 1; i < num.length; i++) {
			System.out.print(String.format("%d", i,  num[i]));

			if(i <= 10 && i % 2 != 0) {
				System.out.print(",");
			}
			if(i > 10 && i % 2 == 0) {
				System.out.print(",");
			}
		}

	}

}