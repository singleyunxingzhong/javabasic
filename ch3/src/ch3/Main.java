package ch3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int signal = 0;
		int r = 0;
		int s = 0;
		String re = null;
		String st = null;

		signal = sc.nextInt();

		if (signal >= 11 && signal <= 59) {
			r = signal / 10;
			s = signal % 10;
			switch (r) {
			case 1:
				re = "unreadable";
				break;
			case 2:
				re = "barely readable, occasional words distinguishable";
				break;
			case 3:
				re = "readable with considerable difficulty";
				break;
			case 4:
				re = "readalbe with practically no difficulty";
				break;
			case 5:
				re = "perfectly readable";
				break;
			}
			switch (s) {
			case 1:
				st = "Faint signals, barely perceptible";
				break;
			case 2:
				st = "Very weak signals";
				break;
			case 3:
				st = "Weak signals";
				break;
			case 4:
				st = "Fair signals";
				break;
			case 5:
				st = "Fairly good signals";
				break;
			case 6:
				st = "Good signals";
				break;
			case 7:
				st = "Moderately strong signals";
				break;
			case 8:
				st = "Strong signals";
				break;
			case 9:
				st = "Extremely strong signals";
				break;
			}
			System.out.println(st+","+" "+re+".");
			sc.close();
		}
	}
}
