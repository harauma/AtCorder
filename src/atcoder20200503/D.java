package atcoder20200503;

public class D {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int x = Integer.parseInt(sc.next());
		int num1,num2;
		double a = 0;
		double b = 0;
		while(true) {
			num1 = (int) (Math.pow(a,5.0) - Math.pow(b, 5.0));
			if(num1 == x) {
				break;
			}
			num2 = (int) (Math.pow(a,5.0) - Math.pow(b * -1, 5.0));
			if(num2 == x) {
				b *= -1;
				break;
			}
			if(x < num1) {
				a = 0;
				b += 1;
			}
			a += 1;
		}

		System.out.println((int)a + " " + (int)b);
	}
}
