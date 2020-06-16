package paiza;

public class PaizaA017 {
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

