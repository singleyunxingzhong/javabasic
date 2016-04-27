package ch2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bjt = 0;
		int utc = 0;
		int hour = 0;
		int min = 0;

		bjt = sc.nextInt();
		if (bjt >= 0 && bjt <= 2359) {
			hour = bjt / 100;
			min = bjt % 100;
			if (min <= 59) {
				if (hour > 8) {
					hour -= 8;
					utc = hour * 100 + min;
				} else if (hour == 8) {
					utc = min;
				} else {
					hour += 16;
					utc = hour * 100 + min;
				}
					System.out.println(utc);

			}
			sc.close();
		}
	}
}