package atcoder20200503;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import paiza.FastScanner;


public class C {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int num1;
		int num2;
		List<Integer> dame = new ArrayList<>();

		long[] height = new long[N];
		for (int i = 0; i < N; i++) {
			height[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0; i < M; i++) {
			num1 = Integer.parseInt(sc.next());
			num2 = Integer.parseInt(sc.next());
			if (height[num1 - 1] < height[num2 - 1]) {
				dame.add(num1);
			} else if (height[num1 - 1] > height[num2 - 1]) {
				dame.add(num2);
			} else {
				dame.add(num1,num2);
			}
		}
		List<Integer> listB = new ArrayList<Integer>(new HashSet<>(dame));

		System.out.println(N - listB.size());
	}
}
