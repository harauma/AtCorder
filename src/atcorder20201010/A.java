package atcorder20201010;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FastScanner sc = new FastScanner();

		String S = sc.next();
		String Y = sc.next();

		if (S.equals("Y")) {
			System.out.print(Y.toUpperCase());
		} else {
			System.out.print(Y);
		}
	}

}
