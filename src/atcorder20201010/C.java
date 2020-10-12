package atcorder20201010;

import java.util.ArrayList;
import java.util.List;

public class C {
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();

		int p;
		int min = 0;
		int n = Integer.parseInt(sc.next());
		List<Integer> num = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			p = Integer.parseInt(sc.next());
			num.add(p);
			while (num.contains(min)) {
				min++;
			}
			System.out.println(min);
		}
//	int m = Integer.parseInt(sc.next());
	}
}
