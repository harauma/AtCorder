package atcoder20200503;

import paiza.FastScanner;

public class E {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int a,b;
		int N = Integer.parseInt(sc.next());
		int[] height = new int[N];
		int count = 0;

		for(int i = 0; i < N; i++) {
			height[i] = Integer.parseInt(sc.next());
		}

		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				a = height[i] + height[j];
				b = (j + 1) - (i + 1);
				if(a == b) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
