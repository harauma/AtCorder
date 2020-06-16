package atcoder20200502;

public class D {
	public static void main(String[] args) {
	        FastScanner sc = new FastScanner();

	        int A = Integer.parseInt(sc.next());
	        long B = Long.parseLong(sc.next());
	        long N = Long.parseLong(sc.next());
	        long max = 0;
	        long sum = 0;

	        for(int i = 1; i <= N; i++) {
	        	long num1 = (A * i) / B;
	        	long num2 = A * (i / B);
	        	sum = num1 - num2;
	        	if(max < sum) {
	        		max = sum;
	        	}
	        }
	        System.out.print(sum);
	}
//		int A = Integer.parseInt(sc.next());
//        long B = Long.parseLong(sc.next());
//        long N = Long.parseLong(sc.next());
//        long max = 0;
//        long sum = 0;
//
//        for(int i = 1; i <= N; i++) {
//        	long num1 = (A * i) / B;
//        	long num2 = A * (i / B);
//        	sum = num1 - num2;
//        	if(max < sum) {
//        		max = sum;
//        	}
//        }
	
}
