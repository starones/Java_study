package sutudy;

public class Test02 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				num++;
				sum += i;
			}
		}
		System.out.println(num);
		System.out.println(sum);

	}
}