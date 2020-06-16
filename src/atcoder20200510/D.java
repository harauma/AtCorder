package atcoder20200510;

import java.util.ArrayList;
import java.util.List;

public class D {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int a = 1;
		int count = 0;
		int[] num = new int[N];
		List<Integer> kurikaesi = new ArrayList<>();
		List<Integer> kurikaesi2 = new ArrayList<>();
		kurikaesi.add(a);
		for(int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(sc.next());
		}

		for(int i = 0; i < K; i++) {
			kurikaesi2.add(num[a -1]);
			while(kurikaesi.get(count) == kurikaesi2.get(count)) {
				count++;
			}
			if() {

			}
			kurikaesi.add(a);
			System.out.println(a);
		}

//		System.out.print(a);
	}
}
