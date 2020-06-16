package atcoder20200503;

import java.util.ArrayList;
import java.util.List;

public class B {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		List<Integer> a = new ArrayList<Integer>();
		int num;
		int num2;

		for(int i = 1; i <= K; i ++) {
			num = Integer.parseInt(sc.next());
			for(int j = 0; j < num; j++) {
				num2 = Integer.parseInt(sc.next());
				if(!a.contains(num2)) {
					a.add(num2);
				}
			}
		}
		System.out.print(N - a.size());
	}
}
