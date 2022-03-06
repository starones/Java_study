package rogate;

public class Else_elseif {
	public static void main(String[] args) {
		int num = 12;
		
		if (num < 10) {
			System.out.println("10より小さい");
		} else if (num < 20) {
			System.out.println("10以上、20より小さい");
		} else {
			System.out.println("20以上");
		}
	}

}
