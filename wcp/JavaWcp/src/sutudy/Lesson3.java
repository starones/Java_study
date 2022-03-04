package sutudy;
//1から10までの整数をカンマ区切りで横並び（10の横にカンマなし）
public class Lesson3 {
	public static void main(String[] args) {
		for(int num = 1; num <= 10; num++) {
			//1から10の整数数を表示
			System.out.print(num);
			//10未満だったらカンマを表示
			if ( num < 10) {
				System.out.print(",");
			}
		}
	}
}
