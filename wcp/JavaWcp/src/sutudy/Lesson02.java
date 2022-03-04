package sutudy;

public class Lesson02 {
	public static void main(String[] args) {
		//偶数カウントようのcount = 0
		int count = 0;
		int sum = 0;
			//偶数を計算するコード
			for (int number = 1; number <=10; number++) {
				if (number % 2 == 0) {
					//偶数カウント
					count++;
					//偶数の和
					sum = sum + number;
				}
			}
		//偶数カウント
		System.out.println(count);
		System.out.println(sum);
	}
}
