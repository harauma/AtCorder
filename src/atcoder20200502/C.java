package atcoder20200502;

import java.util.ArrayList;
import java.util.List;

public class C {
	    public  static void main(String[] args) {
	        FastScanner sc = new FastScanner();

	        int N = Integer.parseInt(sc.next());
	        int M = Integer.parseInt(sc.next());
	        int Q = Integer.parseInt(sc.next());
	        List<Integer> moto = new ArrayList<Integer>();
	        int[] a = new int[N];
	        int[] num = new int[Q];
	        int sum = 0;

	        for(int i = 1; i < M; i++) {
	            moto.add(i);
	        }
	        for(int i = 0; i < N; i++) {
	            a[i] = moto.get(i);
	        }

	        for(int i = 0; i < Q; i++) {
	            for(int j = 0; j < 4; j++) {
	                num[j] = Integer.parseInt(sc.next());
	            }
	            if(a[num[1]] - a[num[0]] == a[num[2]]) {
	                sum += a[num[3]];
	            }
	        }
	        System.out.println(sum);
	    }
}
