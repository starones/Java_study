package sutudy;

public class Test04 {
	public static void main(String[] args) {
		int num[] = new int[20];
		int x = 0;

		for(int i = 0; i < num.length; i++) {
			num[i] = x;
			x = x + 5;
			System.out.print(num[i]);
			if(i <= 10 && num[i] % 2 == 0) {
				System.out.print(",");
			}

			if(i > 10 && num[i] % 2 != 0) {
				System.out.print(",");
			}
		}
		}
	}

