package rogate;
//-------------配列---------------
public class Arrangement {
	public static void main(String[] args) {
		String[] names = {"わんわん", "にゃんにゃん", "オロロロ"};
		
		System.out.println(names[0]);
		System.out.println(names[2]);
		
		
		//---------配列の上書き------------
		// 変数languagesを定義し、配列を代入してください
	    String[] languages = {"Ruby", "PHP", "Python"};
	    
	    // インデックス番号が「1」の要素を出力してください
	    System.out.println(languages[1]);
	    
	    // インデックス番号が「1」の要素を「Java」で上書きしてください
	    languages[1] = "Java";
	    
	    // インデックス番号が「1」の要素を出力してください
	    System.out.println(languages[1]);
	    
	}

}
