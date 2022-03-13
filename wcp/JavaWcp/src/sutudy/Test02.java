package sutudy;

public class Test02 {
	public static void main(String[] args) {
		int num01 = 0;
		int num02 = 0;

		for(int x = 1; x <= 10; x++) {
			if(x % 2 == 0) {
				num01++;
				num02 += x;
			}
		}
		System.out.println(num01);
		System.out.println(num02);
		}
}