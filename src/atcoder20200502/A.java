package atcoder20200502;

public class A {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		String ans = "NG";
		for(int i = b; i <= c; i++) {
			if(i > 0 && a % i == 0) {
				ans = "OK";
			}
		}
		System.out.print(ans);
	}

}
