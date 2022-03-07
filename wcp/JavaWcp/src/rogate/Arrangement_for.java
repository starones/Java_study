package rogate;
//-----------配列と繰り返し文------------
public class Arrangement_for {
	public static void main(String[] args) {
		String[] names = {"猫", "わし", "犬"};

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}


//		--------for文の拡張機能---------
		for (String name: names) {
			System.out.println(name);
		}
	}
}
