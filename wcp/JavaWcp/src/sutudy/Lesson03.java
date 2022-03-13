package sutudy;

public class Lesson03 {
	public static void main(String[] args) {
	    int number[] = new int[20];

	    // nnumberの表示
	    for (int i = 0; i < number.length; i++) {
	    	System.out.print(String.format("%d", i, number[i]));
	    	if (i < 11 && !(i % 2 == 0)) {

	    		System.out.print(",");
	    	}
	    	if (i >= 11 && i % 2 == 0) {

	    		System.out.print(",");
	    	}
	    }
	  }
}
