package ch.work4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int x_duyin = 0;
		String name = "";
		String t_name = "";

		x = sc.nextInt();

		// single number
		if (Math.abs(x) < 10) {
			x_duyin = x;
			if (x > 0) {
				name = duYin(x_duyin);
			} else if (x == 0) {
				name = duYin(x_duyin);
			} else {
				x_duyin = -x_duyin;
				name = "fu" + " " + duYin(x_duyin);
			}
		} else {
			int i = 0;
			int j = 0;
			if (x < 0) {
				i = -x;
			} else {
				i = x;
			}
			while (i != 0) {
				j = i % 10;
				i = i / 10;
				t_name += j + " ";
			}
			t_name = t_name.trim();
			String str[] = t_name.split(" ");
			//System.out.println(t_name);
			if(x<0){
				name+="fu"+" ";
			}
			for (int m = str.length-1; m >= 0; m--) {

				x_duyin=Integer.parseInt(str[m]);
				name+=duYin(x_duyin)+" ";
			}

		}
		System.out.println(name.trim());
		sc.close();
	}

	public static String duYin(int i) {
		String s = "";
		switch (i) {
		case 1:
			s += "yi";
			break;
		case 2:
			s += "er";
			break;
		case 3:
			s += "san";
			break;
		case 4:
			s += "si";
			break;
		case 5:
			s += "wu";
			break;
		case 6:
			s += "liu";
			break;
		case 7:
			s += "qi";
			break;
		case 8:
			s += "ba";
			break;
		case 9:
			s += "jiu";
			break;
		case 0:
			s += "ling";
			break;
		}
		return s;

	}
}
