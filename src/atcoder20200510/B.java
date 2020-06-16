
package atcoder20200510;

public class B {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int sum,num;
		int max;

		max = Math.min(A, K);
		if(0 < K - A - B) {
			max += Math.min(C, K - A - B) * -1;
		}

		System.out.print(max);
	}

}

