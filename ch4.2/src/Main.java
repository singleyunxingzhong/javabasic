import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int m = 0;
		int count = 0;
		int sum = 0;
		n = sc.nextInt();
		m = sc.nextInt();

		if (n > 0 && n <= m && m <= 200) {
			for (int i = 2; i <= 20000 && count < m; i++) {
				if (isZhi(i)) {
					count++;
					if (count >= n) {

						sum += i;
					}

				}
			}
		}
		
		System.out.println(sum);
		sc.close();
	}

	public static boolean isZhi(int i) {
		boolean b = true;
		if (i == 2)
			return true;
		else {
			int temp1 = (int) Math.sqrt(i);
			int temp2 = 2;

			while (temp2 <= temp1) {
				if (i % temp2 == 0) {
					b = false;
					break;
				}
				temp2++;
			}
			return b;
		}
	}
}