package atcoder20200510;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int a,b;
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		HashMap<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>> ();

		for(int i = 1; i <= n; i++) {
			map.put(i,new ArrayList<Integer>());
		}

		for(int i = 0; i < m; i++) {
			a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());
			if(!map.get(a).contains(b)) {
				map.get(a).add(b);
				map.get(b).add(a);
			}
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
