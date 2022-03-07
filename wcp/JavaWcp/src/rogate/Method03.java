package rogate;

//-------複数の引数の場合---------
public class Method03 {
	public static void main(String[] args) {
		printSeed("俺様", 33);
		printSeed("私様", 99);
	}

	public static void printSeed(String name, int age) {
		System.out.println("名前は" + name);
		System.out.println("年は" + age);
	}

}
