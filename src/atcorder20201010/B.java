package atcorder20201010;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FastScanner sc = new FastScanner();

		String S;
		int count = 0;
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String hoge [][] = new String[H][W];

		for (int i = 0; i < H; i ++) {
			S = sc.next();
			hoge[i] = S.split("");
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (j + 1 != W) {
					if (hoge[i][j] == "." && hoge[i][j + 1] == ".") {
						count++;
					}
				}
				if (i + 1 != H) {
					if (hoge[i][j] == "." && hoge[i + 1][j + 1] == ".") {
						count++;
					}
				}
			}
		}
		System.out.print(count);
	}

}
