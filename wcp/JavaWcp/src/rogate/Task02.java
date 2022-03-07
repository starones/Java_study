package rogate;
//--------奇数と偶数の合計--------
public class Task02 {
	public static void main(String[] args) {
		int[] nums = {1, 4, 6, 9, 13, 16};

		int addSum = 0;
		int evenSum = 0;

		for (int i : nums) {
			if (i % 2 == 0) {
				addSum += i;
			} else {
				evenSum += i;
			}
		}
		System.out.println(addSum);
		System.out.println(evenSum);
	}

}
