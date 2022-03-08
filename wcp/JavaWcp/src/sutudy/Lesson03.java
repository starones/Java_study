package sutudy;

public class Lesson03 {
	 public static void main(String[] args) {
		    int number[] = new int [20];
		    for (int i = 0; i <  number.length; i++) {
		    	int number2 = number[i] + 5;
		    	number[i] = number2;
		      System.out.print( number[i]);
		    }
		  }
}
