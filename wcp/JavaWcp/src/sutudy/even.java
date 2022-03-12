package sutudy;

//1から10の偶数表示
public class even {
	public static void main(String[] args) {
		//---------for文-------
		for (int number = 1; number <= 10; number++) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}

		//--------while文（奇数表示）--------
		int num = 0;
		while (num < 10) {
			num++;
				if (num % 2 != 0) {
					System.out.println(num);
				}
		}
	}
}
