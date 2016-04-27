import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[101];
		int cut = 0;
		int cs_p = 0;
		int xs_p = 0;
		int max_cs = 0;
		int re_ling = 0;

		String s = "";

		while (cut < 2) {
			cs_p = sc.nextInt();
			xs_p = sc.nextInt();
			if (cs_p <= 100 && cs_p >= 0) {
				num[cs_p] += xs_p;
				if (cs_p >= max_cs && xs_p != 0) {
					max_cs = cs_p;
				}
				if (cs_p == 0) {
					cut++;
				}
			}

		}

		for (int i = num.length - 1; i >= 0; i--) {
			cs_p = i;
			xs_p = num[i];
			if (num[i] != 0) {
				re_ling++;
				if (cut == 2) {
					if (xs_p < 0) {
						s += "-";
					}
					s += outNum(cs_p, xs_p);
					cut++;
				} else {
					if (xs_p < 0) {
						s += "-" + outNum(cs_p, xs_p);
					} else {
						s += "+" + outNum(cs_p, xs_p);
					}
				}
			}
		}
		if (re_ling == 0) {
			s += "0";
		}
		// System.out.println(num[100]+"x100");
		System.out.println(s.trim());
		sc.close();
	}

	public static String outNum(int cs, int xs) {
		String s = "";
		int abs_xs = Math.abs(xs);
		if (abs_xs == 0) {
			s += "";
		} else if (abs_xs == 1 && cs != 1 && cs != 0) {
			s += "x" + cs;
		} else if (abs_xs == 1 && cs == 1) {
			s += "x";
		} else if (cs == 1) {
			s += abs_xs + "x";
		} else if (cs == 0) {
			s += abs_xs;
		} else {
			s += abs_xs + "x" + cs;
		}

		return s;
	}
}