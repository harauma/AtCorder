package paiza;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int h,w,x,a,num;
		boolean flg;
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		String[][] ans = new String[H][W];

		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				ans[i][j] = ".";
			}
		}

		for(int i = 0; i < N; i++) {
			flg = true;
			h = Integer.parseInt(sc.next());
			w = Integer.parseInt(sc.next());
			x = Integer.parseInt(sc.next());

			if(i == 0) {
				num = H;
			} else {
				num = 0;
			}

			while(flg && i != 0) {
				for(int k = x; k < w + x; k++) {
					if(ans[num][k].equals("#")) {
						num--;
						flg = false;
					}
				}
				if(num + 1 == H) {
					num--;
					flg = false;
				} else {
					num++;
				}
			}

			for(int j = 0; j < h; j++) {
				for(int k = x; k < w + x; k++) {
					ans[num - 1][k] = "#";
				}
				num--;
			}
		}
		disp(ans,H,W);
	}

	static void disp(String[][] ans, int H, int W) {
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println("");
		}
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
}
