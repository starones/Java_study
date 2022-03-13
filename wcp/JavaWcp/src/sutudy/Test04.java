package sutudy;

public class Test04 {
	public static void main(String[] args) {
		int num[] = new int[20];

		for(int x = 0; x < num.length; x++) {
			System.out.print(String.format("%d", x, num[x]));
			
				if(x < 11 && !(x % 2 == 0)) {
					System.out.print(",");
				}
				if(x >= 11 && x % 2 == 0) {
					System.out.print(",");
				}
		}


	}

}