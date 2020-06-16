package atcoder20200502;

public class B {
	public static void main(String[] args) {
	FastScanner sc = new FastScanner();
	long a = Long.parseLong(sc.next());
	long sum = 100;
	long count = 0;
	while(a > sum) {
		sum *= 1.01;
		count++;
	}
	System.out.print(count);
}
}
